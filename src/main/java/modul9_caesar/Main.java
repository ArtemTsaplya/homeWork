package modul9_caesar;

public class Main {
    public static void main(String[] args) {
        CaesarCode caesarCode = new CaesarCode();
        int encodeMode = 3;
        String encodeText = "abc";
        String textEncode = caesarCode.caesarEncode(encodeText, encodeMode);
        System.out.println(textEncode);

        String textDecode = caesarCode.caesarDecode(textEncode, encodeMode);
        System.out.println(textDecode);
    }
}
