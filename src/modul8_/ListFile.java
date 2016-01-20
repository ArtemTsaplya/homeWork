package modul8_;

public class ListFile {
    private String nameFile;
    private int sizeFile;

    public ListFile(String nameFile, int sizeFile) {
        this.nameFile = nameFile;
        this.sizeFile = sizeFile;
    }

    public String getNameFile() {
        return nameFile;
    }

    public int getSizeFile() {
        return sizeFile;
    }

    @Override
    public String toString() {
        return "nameFile= '" + nameFile + '\'' + ", sizeFile= " + sizeFile + " mb";
    }
}
