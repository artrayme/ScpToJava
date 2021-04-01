import antlr.SCPLexer;
import antlr.SCPParser;
import nodes.BaseNode;
import nodes.Visitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

        Main obj = new Main();

        CharStream inputStream = null;
        try {
            inputStream = CharStreams.fromString(obj.readFileAsString("src/CodeSample.auf"));
        } catch (IOException e) {
            e.printStackTrace();
        }


        SCPLexer lexer = new SCPLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        SCPParser parser = new SCPParser(tokens);

        ParseTree tree = parser.for_satement(); // parse
        Visitor visitor = new Visitor();


        BaseNode result = visitor.visit(tree);

        Converter converter = new Converter();
        converter.toJava(Visitor.code, Paths.get("src/main/java/Test.java"));
        // System.out.println(result);





    }

    private String executeCommand(String command) {
        StringBuffer output = new StringBuffer();
        Process p;

        try {
            p = Runtime.getRuntime().exec(command);
            p.waitFor();
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = "";
            while ((line = reader.readLine()) != null) {
                output.append(line).append("\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return output.toString();

    }


    private String readFileAsString(String filePath) throws IOException {
        StringBuffer fileData = new StringBuffer();
        BufferedReader reader = new BufferedReader(
                new FileReader(filePath));
        char[] buf = new char[1024];
        int numRead = 0;
        while ((numRead = reader.read(buf)) != -1) {
            String readData = String.valueOf(buf, 0, numRead);
            fileData.append(readData);
        }
        reader.close();
        return fileData.toString();
    }
}


