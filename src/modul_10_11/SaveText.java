package modul_10_11;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SaveText {
    String dataFile = "dataFile";
    public void textOutSave(String decodeText) {
        try (DataOutputStream stream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(dataFile)))) {
            stream.writeUTF(decodeText);
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
