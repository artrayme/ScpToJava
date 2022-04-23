import java.io.IOException
import java.nio.charset.StandardCharsets
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardOpenOption

class Converter {
    private val code: MutableList<String> = ArrayList()
    fun toJava(code: List<String>?, path: Path?) {
        this.code.add("public class Test{")
        this.code.add("private static Test test = new Test();")
        this.code.add("public static void main (String[] args){")
        this.code.addAll(code!!)
        this.code.add("}")
        this.code.add("}")
        if (Files.exists(path)) {
            println("File already exists")
        } else {
            try {
                Files.createFile(path)
            } catch (e: IOException) {
                e.printStackTrace()
            }
        }
        try {
            Files.write(
                path, this.code, StandardCharsets.UTF_8,
                StandardOpenOption.APPEND
            )
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
}