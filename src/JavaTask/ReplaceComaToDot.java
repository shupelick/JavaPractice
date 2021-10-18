package JavaTask;

import java.util.Scanner;

public class ReplaceComaToDot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input file path: ");
        String inputFilePath = in.nextLine();
        ReplaceDotHelper helper = new ReplaceDotHelper(inputFilePath);
        helper.runReplace();
    }
}