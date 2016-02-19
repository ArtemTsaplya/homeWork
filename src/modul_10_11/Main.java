package modul_10_11;

import java.util.Scanner;

public class Main {
    private static int encodeMode;

    public static void main(String[] args) {
        System.out.print("Please enter text for Encryption: ");
        Scanner scanner = new Scanner(System.in);
        String encodeText = scanner.nextLine();
        System.out.print("Enter mode: ");
        try {
            encodeMode = scanner.nextInt();
            if (encodeMode < 0) {
                throw new NegativeNumberException();
            }
        } catch (NegativeNumberException ex) {
            System.out.println("[Error]: Please enter positive number!");
            return;
        } catch (IllegalStateException e) {
            e.getStackTrace();
        }
        EncodeDecodeForText forText = new EncodeDecodeForText();
        String encodeToText = forText.encodeForText(encodeText, encodeMode);
        System.out.println(encodeToText);

        String decodeToText = forText.decodeForText(encodeToText, encodeMode);
        System.out.println(decodeToText);

        SaveText text = new SaveText();
        text.textOutSave(decodeToText);
    }
}
