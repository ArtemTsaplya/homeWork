package modul_10_11;

public class EncodeDecodeForText {
    public String encodeForText(String stringEncode, int mod) {
        char[] stringArray = stringEncode.toCharArray();
        int i = 0;
        for (char c : stringArray) {
            int charToASCII = (int) c;
            charToASCII = charToASCII + mod;
            char intToASCII = (char) charToASCII;
            stringArray[i] = intToASCII;
            i++;
        }
        StringBuilder builder = new StringBuilder();
        for (char c : stringArray) {
            builder.append(c);
        }
        return builder.toString();
    }
    public String decodeForText(String encodeToText, int mod) {
        char[] stringArray = encodeToText.toCharArray();
        int i = 0;
        for (char c : stringArray) {
            int charToASCII = (int) c;
            charToASCII = charToASCII - mod;
            char intToASCII = (char) charToASCII;
            stringArray[i] = intToASCII;
            i++;
        }
        StringBuilder builder = new StringBuilder();
        for (char c : stringArray) {
            builder.append(c);
        }
        return builder.toString();
    }
}