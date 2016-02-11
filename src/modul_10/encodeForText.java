package modul_10;

import java.util.Arrays;

public class EncodeForText {
    private static String st;

    public static String getSt() {
        return st;
    }

    public  void encodeForText(String stringEncode, int mod) {
        char[] stringArray = stringEncode.toCharArray();
        for (int i = 0; i < stringArray.length; i++) {
            char a = stringArray[i];
            int b = (int) a;                              // переводим текст в символы по ASCII
            b = b + mod;                                 // измененяем значение по методу шифрования Цезаря
            char r = (char) b;                   // и сохраняем в массив
            stringArray[i] = r;
        }
        System.out.print("Encryption text: ");
        st = Arrays.toString(stringArray)
                .replace("[","")
                .replace("]","")
                .replace(",","");
        System.out.print(getSt());

    }

}