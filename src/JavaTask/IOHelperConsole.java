package JavaTask;

import java.util.Scanner;

public class IOHelperConsole extends IOHelperBase {

    public String readLine(){
        Scanner in = new Scanner(System.in);
        String inputText = in.nextLine();
        in.close();
        return inputText;
    }

    public void writeLine(String text){
        System.out.println("Coma is replaced by dot: " + text);
    }
}