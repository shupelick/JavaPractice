package JavaTask;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOHelper {
    public String readLine(String inputFilePath) {
        StringBuilder fullText = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath)))
        {
            String line;
            while ((line = reader.readLine()) != null){
                fullText.append(line);
                fullText.append("\n");
            }
            return fullText.toString();
        } catch (IOException e){
            System.out.println("File not found");
        }
        return "File not found";
    }

    public void writeLine(String text, String inputFilePath) {
        String outputFilePath = inputFilePath.substring(0, inputFilePath.lastIndexOf("\\") + 1) + "output_file" +
                inputFilePath.substring(inputFilePath.lastIndexOf("."));
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath)))
        {
            writer.write(text);
            writer.newLine();
            System.out.println("Coma is replaced by dot in file: " + outputFilePath);
        } catch (IOException e){
            System.out.println("File not found");
        }
    }
}
