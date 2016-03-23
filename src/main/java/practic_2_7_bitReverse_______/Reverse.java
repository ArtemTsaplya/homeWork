package practic_2_7_bitReverse_______;

public class Reverse {
    int result;
    public int reverse(int input) {
        StringBuilder builder = new StringBuilder(Integer.toBinaryString(input));
        int lenth = builder.length();
        for (int i = 0; i < 32 - lenth; i++) {
            builder.insert(0, 0);
        }
            StringBuilder num = builder.reverse();
        result = Integer.parseInt(num.toString());
        return result;
    }
}
