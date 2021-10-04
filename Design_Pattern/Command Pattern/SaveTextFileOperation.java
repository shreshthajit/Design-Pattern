package Command_Pattern;

public class SaveTextFileOperation implements TextFileOperation {

    private TextFile textFile;
    @Override
    public String execute() {
        return textFile.save();
    }
}