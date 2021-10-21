package JavaTask;

public class ReplaceDotHelper {

    IOHelperBase ioHelperBase;

    ReplaceDotHelper(IOHelperBase ioHelperBase){
        this.ioHelperBase = ioHelperBase;
    }

    public void runReplace() {
        String inputText = ioHelperBase.readLine();
        if (!inputText.equals("File not found")) {
            String replacedText = inputText.replace(",", ".");
            ioHelperBase.writeLine(replacedText);
        }
    }
}