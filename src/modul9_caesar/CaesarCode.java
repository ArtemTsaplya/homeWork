package modul9_caesar;

public class CaesarCode {
    public  void caesarEncode(String stringEncode, int mod) {
        char[] stringArray = stringEncode.toCharArray();
        for (int i = 0; i < stringArray.length; i++) {
            char a = stringArray[i];
            int b = (int) a;                              // переводим текст в символы по ASCII
            b = b + mod;                                 // измененяем значение по методу шифрования Цезаря
            char r = (char) b;                   // и сохраняем в массив
            stringArray[i] = r;
        }
        System.out.print("Encryption text: ");
        for (char c : stringArray) {
            System.out.print(c);
        }
    }
    public void caesarDecode(String stringDecode, int mod){
        char[] stringArray = stringDecode.toCharArray();
        for (int y = 0; y < stringArray.length; y++) {
            char a =  stringArray[y];
            int b = (int)a;                              // переводим текст в символы по ASCII
            b = b - mod;                                 // измененяем значение по методу шифрования Цезаря
            char r = (char) b;                   // и сохраняем в массив
            stringArray[y] = r;
        }
        System.out.println();
        System.out.print("Decoding text :");
        for (char v: stringArray){
            System.out.print(v);
        }
    }

}