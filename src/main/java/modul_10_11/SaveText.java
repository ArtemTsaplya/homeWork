package modul_10_11;

import java.io.*;

public class SaveText {
    String dataFile = "dataFile.txt";
    public void textOutSave(String decodeText) {
        File file = new File(dataFile);
        try (FileWriter  fileWriter = new FileWriter(file)){
            fileWriter.write(decodeText);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
