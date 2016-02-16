package modul9_caesar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.print("Please enter text for Encryption: ");
//        Scanner scanner = new Scanner(System.in);
//        String encodeText = scanner.nextLine();
//        System.out.print("Enter mode: ");
//        int encodeMode = scanner.nextInt();
//
//        System.out.print("Please enter text for Decoding: ");
//        Scanner scanner2 = new Scanner(System.in);
//        String decodeText = scanner2.nextLine();
//        System.out.print("Enter mode: ");
//        int decodeMod = scanner2.nextInt();

        CaesarCode caesarCode = new CaesarCode();
        int encodeMode = 3;
        String encodeText = "abc";
        String text = caesarCode.caesarEncode(encodeText,encodeMode);
        System.out.println(text);
    }
}
