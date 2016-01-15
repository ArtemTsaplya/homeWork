package modul6_task1;

import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File {
    public static void main(String[] args) {

        try {
            FileInputStream file = new FileInputStream("c:/tmp/123.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
        final Scanner scanner = new Scanner(System.in);
        final int age = scanner.nextInt();

        MyAge agePeople = new MyAge();

        try {
            agePeople.myAge(age);
        } catch (AgeException e) {
            System.out.println("Exception: invalid age - " + e.getAge());
        }
    }
}
