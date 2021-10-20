package JavaTask;


import java.io.File;
import java.util.Scanner;

public class ReplaceComaToDot {
    public static void main(String[] args) {
        File inputFile;
        String inputFilePath;
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Input file path: ");
            inputFilePath = in.nextLine();
            inputFile = new File(inputFilePath);
        } while (!inputFile.exists());
        in.close();
        ReplaceDotHelper helper = new ReplaceDotHelper(inputFilePath);
        helper.runReplace();
    }
}