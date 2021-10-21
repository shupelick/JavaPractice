package JavaTask;

import java.io.File;
import java.util.Scanner;

public class ReplaceComaToDot {
    public static void main(String[] args) {
        File inputFile;
        String inputFilePath;
        String inputKeyWord;
        ReplaceDotHelper helper;
        IOHelperBase ioHelperBase = new IOHelperBase();
        Scanner in = new Scanner(System.in);

        System.out.println("If you want to to use file, input keyword 'file'");
        System.out.println("If you want to to use console, input keyword 'console'");

        do {
            System.out.print("Input keyword: ");
            inputKeyWord = in.nextLine();
        } while (!(inputKeyWord.equals("file") || inputKeyWord.equals("console")));

        switch (inputKeyWord) {
            case "file":
                do {
                    System.out.print("Input file path: ");
                    inputFilePath = in.nextLine();
                    inputFile = new File(inputFilePath);
                } while (!inputFile.exists());
                ioHelperBase = new IOHelper(inputFilePath);
                break;

            case "console":
                System.out.print("Input text: ");
                ioHelperBase = new IOHelperConsole();
                break;
        }
        helper = new ReplaceDotHelper(ioHelperBase);
        helper.runReplace();
        in.close();
    }
}