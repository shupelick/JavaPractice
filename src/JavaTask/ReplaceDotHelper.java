package JavaTask;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReplaceDotHelper {
    public void runReplace(String inputFilePath) {
        String outputFilePath = inputFilePath.substring(0, inputFilePath.lastIndexOf("\\") + 1) + "output_file.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath)))
        {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.replace(",", "."));
                writer.newLine();
            }
            System.out.println("Coma is replaced by dot in file: " + outputFilePath);
        } catch (IOException e){
            System.out.println("File not found");
        }
    }
}
