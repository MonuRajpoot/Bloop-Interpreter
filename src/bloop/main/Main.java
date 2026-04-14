package bloop.main;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {

        // make sure the user gave us a file path to run
        if (args.length == 0) {
            System.err.println("Usage: java bloop.main.Main <filename>.bloop");
            System.err.println("Example: java bloop.main.Main programs/program1.bloop");
            return;
        }

        String filePath = args[0];

        // make sure the file has the correct .bloop extension
        if (!filePath.endsWith(".bloop")) {
            System.err.println("Error: file must have a .bloop extension");
            System.err.println("Got: " + filePath);
            return;
        }

        // read the entire file contents into a string
        String sourceCode;
        try {
            sourceCode = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            System.err.println("Error: could not read file '" + filePath + "'");
            System.err.println("Make sure the file exists and the path is correct");
            return;
        }

        // pass the source code to the interpreter and run it
        Interpreter interpreter = new Interpreter();
        interpreter.run(sourceCode);
    }
}
