package modul_10;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SaveText {
    private String dataFile = "dataFile";
    private String stu = DecodeForText.getStDecode();
    public void textOutSave(){
        try (DataOutputStream stream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(dataFile)))) {
            stream.writeUTF(stu);
        }catch (IOException e){
            e.getStackTrace();
        }
    }
}
