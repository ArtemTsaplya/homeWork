package modul6_task1;

import java.io.BufferedReader;
import java.io.FileReader;

public class File {
    public static void main(String[] args) {

        String fileName = "textfile.txt";
        try {
            BufferedReader input = new BufferedReader(new FileReader(fileName));

        } catch (java.io.FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
