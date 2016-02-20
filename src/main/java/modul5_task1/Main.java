package modul5_task1;

public class Main {
    public static void main(String[] args) {
        int[] array = {10, 3, 15, 8};
        MinMaxNumber number = new MinMaxNumber();
        final int numberMax = number.maxNumber(array);
        final int numberMin = number.minNumber(array);
        System.out.println(numberMax);
        System.out.println(numberMin);
    }
}

