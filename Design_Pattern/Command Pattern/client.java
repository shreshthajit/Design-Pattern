package Command_Pattern;

public class client {
    public static void main(String[] args) {
        TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();
        TextFile textFile = new TextFile();
        textFileOperationExecutor.executeOperation(textFile::open);
        textFileOperationExecutor.executeOperation(textFile::save);
    }
}
