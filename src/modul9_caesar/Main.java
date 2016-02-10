package modul9_caesar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Please enter text for Encryption: ");
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();
        System.out.print("Please enter text for Decoding: ");
        String string2 = scanner.nextLine();
        CaesarCode caesarCode = new CaesarCode();
        caesarCode.caesarEncode(string1,3);
        caesarCode.caesarDecode(string2,3);
    }
}
