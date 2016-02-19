package modul9_caesar;

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
        for (char c : charArray) {
            builder.append(c);
        }
        return builder.toString();
    }

    public String caesarDecode(String text, int mod) {
        char[] stringArray = text.toCharArray();
        int i = 0;
        for (char c : stringArray) {
            int CharTOASCII = (int) c;
            CharTOASCII = CharTOASCII - mod;
            char ASCIItoChar = (char) CharTOASCII;
            stringArray[i] = ASCIItoChar;
            i++;
        }
        StringBuilder builder = new StringBuilder();
        for (char c : stringArray) {
            builder.append(c);
        }
        return builder.toString();
    }
}