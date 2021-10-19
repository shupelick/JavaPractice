package JavaTask;

public class ReplaceDotHelper {

    String inputFilePath;
    IOHelper ioHelper;

    ReplaceDotHelper(String inputFilePath){
        this.inputFilePath = inputFilePath;
        this.ioHelper = new IOHelper();
    }

    public void runReplace() {
        String inputText = ioHelper.readLine(inputFilePath);
        if (!inputText.equals("File not found")) {
            String replacedText = inputText.replace(",", ".");
            ioHelper.writeLine(replacedText, inputFilePath);
        }
    }
}