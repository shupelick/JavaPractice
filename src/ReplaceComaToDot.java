import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReplaceComaToDot {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("dot_file.txt"));
             BufferedReader reader = new BufferedReader(new FileReader("coma_file.txt")))
        {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.replace(",", "."));
                writer.newLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}