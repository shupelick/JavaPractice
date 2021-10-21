package JavaTask;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOHelper extends IOHelperBase {

    String inputFilePath;
    String outputFilePath;
    BufferedReader reader;
    BufferedWriter writer;

    IOHelper(String inputFilePath) {
        this.inputFilePath = inputFilePath;
        this.outputFilePath = inputFilePath.substring(0, inputFilePath.lastIndexOf("\\") + 1) + "output_file" +
                inputFilePath.substring(inputFilePath.lastIndexOf("."));

        try {
            reader = new BufferedReader(new FileReader(inputFilePath));
        } catch (IOException e){
            System.out.println("File not found");
        }

        try {
            writer = new BufferedWriter(new FileWriter(outputFilePath));
        } catch (IOException e){
            System.out.println("File not found");
        }
    }

    public String readLine() {
        StringBuilder fullText = new StringBuilder();
        try {
            String line;
            while ((line = reader.readLine()) != null){
                fullText.append(line);
                fullText.append("\n");
            }
            reader.close();
            return fullText.toString();
        } catch (IOException e){
            System.out.println("File not found");
        }
        return "File not found";
    }

    public void writeLine(String text) {
        try {
            writer.write(text);
            writer.newLine();
            writer.flush();
            System.out.println("Coma is replaced by dot in file: " + outputFilePath);
            writer.close();
        } catch (IOException e){
            System.out.println("File not found");
        }
    }
}
