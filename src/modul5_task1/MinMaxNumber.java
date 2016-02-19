package modul5_task1;

import java.util.Arrays;

public class MinMaxNumber {
    private int number;

    public int maxNumber(int array[]) {
        Arrays.sort(array);
        number = array[array.length - 1];
        return number;
    }

    public int minNumber(int array[]) {
        Arrays.sort(array);
        number = array[0];
        return number;
    }
}
