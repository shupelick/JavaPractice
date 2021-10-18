import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReplaceComaToDot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input file path: ");
        String fileName = in.nextLine();
        replaceComaToDot(fileName);
    }

    public static void replaceComaToDot(String inputFilePath){
        String outputFilePath = inputFilePath.substring(0, inputFilePath.lastIndexOf("\\") + 1) + "output_file.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath)))
        {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.replace(",", "."));
                writer.newLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.print("Coma is replaced by dot in file: " + outputFilePath);
    }
}