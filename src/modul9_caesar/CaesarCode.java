package modul9_caesar;

import java.util.Arrays;

public class CaesarCode {

    public String caesarEncode(String stringEncode, int mod) {
        char[] charArray = stringEncode.toCharArray();
        int i = 0;
        for (char c : charArray) {
            int charToASCII = (int) c;                              // переводим текст в символы по ASCII
            charToASCII = charToASCII + mod;                                 // измененяем значение по методу шифрования Цезаря
            char ASCIItoChar = (char) charToASCII;                   // и сохраняем в массив
            charArray[i] = ASCIItoChar;
            i++;
        }
        StringBuilder builder = new StringBuilder();
        for (char c : charArray){
            builder.append(c);
        }
        return builder.toString();
    }

    public void caesarDecode(String stringDecode, int mod) {
        char[] stringArray = stringDecode.toCharArray();
        for (int y = 0; y < stringArray.length; y++) {
            char a = stringArray[y];
            int b = (int) a;                              // переводим текст в символы по ASCII
            b = b - mod;                                 // измененяем значение по методу шифрования Цезаря
            char r = (char) b;                   // и сохраняем в массив
            stringArray[y] = r;
        }
        System.out.println();
        System.out.print("Decoding text :");
        for (char v : stringArray) {
            System.out.print(v);
        }
    }

}