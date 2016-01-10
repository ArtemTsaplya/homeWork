package modul6_task1;

public class FileNotFoundException extends Exception {
    final private String fileName;

    public FileNotFoundException(String fileName) {
        this.fileName = fileName;
    }
}
