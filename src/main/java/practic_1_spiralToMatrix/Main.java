package practic_1_spiralToMatrix;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SpiralToMatrix toMatrix = new SpiralToMatrix();
        int[][]arrayM = {{1, 2, 3, 4, 5, 6}, {7, 8, 9, 10, 11, 12}, {13, 14, 15, 16, 17, 18}};
        int resultArray[] = toMatrix.print(arrayM);
        String array = Arrays.toString(resultArray);
        System.out.println(array);
    }
}
