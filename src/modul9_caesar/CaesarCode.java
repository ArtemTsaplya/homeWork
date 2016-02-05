package modul9_caesar;

import java.util.Scanner;
public class CaesarCode {
    public  void caesarEncode(int mod){
        System.out.print("Please enter text for Encryption: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();             //считываем текст
        char[] stringArray = string.toCharArray();
        for (int i = 0; i < stringArray.length; i++) {
            char a =  stringArray[i];
            int b = (int)a;                              // переводим текст в символы по ASCII
            b = b + mod;                                 // измененяем значение по методу шифрования Цезаря
            char r = (char) b;                   // и сохраняем в массив
            stringArray[i] = r;
        }
        System.out.print("Encryption text: ");
        for (char c : stringArray){
            System.out.print(c);
        }
        System.out.println();
        for (int y = 0; y < stringArray.length; y++) {
            char a =  stringArray[y];
            int b = (int)a;                              // переводим текст в символы по ASCII
            b = b - mod;                                 // измененяем значение по методу шифрования Цезаря
            char r = (char) b;                   // и сохраняем в массив
            stringArray[y] = r;
        }
        System.out.print("Original text :");
        for (char v: stringArray){
            System.out.print(v);
        }
    }
}
