import nodes.Visitor
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTree
import java.io.BufferedReader
import java.io.FileReader
import java.io.IOException
import java.io.InputStreamReader
import java.nio.file.Paths

class Main {
    private fun executeCommand(command: String): String {
        val output = StringBuffer()
        val p: Process
        try {
            p = Runtime.getRuntime().exec(command)
            p.waitFor()
            val reader = BufferedReader(InputStreamReader(p.inputStream))
            var line: String? = ""
            while (reader.readLine().also { line = it } != null) {
                output.append(line).append("\n")
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return output.toString()
    }

    @Throws(IOException::class)
    private fun readFileAsString(filePath: String): String {
        val fileData = StringBuffer()
        val reader = BufferedReader(
            FileReader(filePath)
        )
        val buf = CharArray(1024)
        var numRead = 0
        while (reader.read(buf).also { numRead = it } != -1) {
            val readData = String(buf, 0, numRead)
            fileData.append(readData)
        }
        reader.close()
        return fileData.toString()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val obj = Main()
            var inputStream: CharStream? = null
            try {
                inputStream = CharStreams.fromString(obj.readFileAsString("src/CodeSample.auf"))
            } catch (e: IOException) {
                e.printStackTrace()
            }
            val lexer = SCPLexer(inputStream)
            val tokens = CommonTokenStream(lexer)
            val parser = SCPParser(tokens)
            val tree: ParseTree = parser.for_satement() // parse
            val visitor = Visitor()
            val result = visitor.visit(tree)!!
            val converter = Converter()
            converter.toJava(ArrayList(), Paths.get("src/main/java/Test.java"))
            // System.out.println(result);
        }
    }
}