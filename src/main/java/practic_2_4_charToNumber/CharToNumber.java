package practic_2_4_charToNumber;

public class CharToNumber {
    public int convert(String num) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < num.length(); i++) {
            int charString = num.charAt(i);
            builder.append(charString - 'a');
        }
        return Integer.parseInt(builder.toString());
    }
}
