package practic_2_6_bitPalindrome;

public class BitsPalindrome {
    public boolean isPalindrome(int input) {
        StringBuilder builder = new StringBuilder(Integer.toBinaryString(input));
        System.out.println(Integer.toBinaryString(input));
        int length = builder.length();
        for (int i = 0; i < 32 - length; i++) {
            builder.insert(0, 0);
        }
        String number = builder.toString();
        System.out.println(number);
        String numberRevers = builder.reverse().toString();
        System.out.println(numberRevers);
        return number.equals(numberRevers);
    }
}