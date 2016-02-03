package modul8_;

import java.util.*;

public class MySetFile {
    public void mySetFile() {
        System.out.println("File list:");
        System.out.println("_____________________");
        SortedSet <String> setFiles = new TreeSet <>();
        setFiles.add("Текстовый файл");
        setFiles.add("Аудио файл");
        setFiles.add("Файл изображение");
        setFiles.add("Видео файл");
        String sr = "|";
        Iterator it = setFiles.iterator();
        for (String st :setFiles) {
            Object element = it.next();
            st = element.toString();
            System.out.printf("%1$s%2$20s%3$s%n",sr,st,sr);
            System.out.println("_____________________");
        }
    }
}