package practic_1;

import java.util.Arrays;

public class SumNumber {
    private int maxNumber;

    public int max(int[] input) {
        maxNumber = Arrays.stream(input).max().getAsInt();
        return maxNumber;
    }
}