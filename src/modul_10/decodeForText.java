package modul_10;

import java.util.Arrays;

public class DecodeForText {
    private String stEncode = EncodeForText.getSt();
    private static String stDecode;
    public static String getStDecode() {
        return stDecode;
    }

    public void decodeForText(int mod){
        char[] stringArray = stEncode.toCharArray();
        for (int y = 0; y < stringArray.length; y++) {
            char a =  stringArray[y];
            int b = (int)a;                              // переводим текст в символы по ASCII
            b = b - mod;                                 // измененяем значение по методу шифрования Цезаря
            char r = (char) b;                   // и сохраняем в массив
            stringArray[y] = r;
        }
        System.out.println();
        stDecode = Arrays.toString(stringArray)
                .replace("[", "")
                .replace(",", "")
                .replace("]", "");
        System.out.print("Decoding text : " + stDecode);
    }
}
