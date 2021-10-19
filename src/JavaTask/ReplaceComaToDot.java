package JavaTask;


import java.io.File;
import java.util.Scanner;

public class ReplaceComaToDot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input file path: ");
        String inputFilePath = in.nextLine();
        File inputFile = new File(inputFilePath);
        if(inputFile.exists()) {
            ReplaceDotHelper helper = new ReplaceDotHelper(inputFilePath);
            helper.runReplace();
        } else {
            System.out.print("File doesn't exist");
        }
    }
}