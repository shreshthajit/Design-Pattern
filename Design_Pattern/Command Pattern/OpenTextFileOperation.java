package Command_Pattern;

public class OpenTextFileOperation implements TextFileOperation {

    private TextFile textFile;

    @Override
    public String execute() {
        return textFile.open();
    }
}