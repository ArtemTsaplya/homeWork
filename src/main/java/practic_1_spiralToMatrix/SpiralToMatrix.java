package practic_1_spiralToMatrix;

public class SpiralToMatrix {

    public int[] print(int[][] input) {
        int countMatrix = input.length * input[0].length;
        int[] array = new int[countMatrix];
        int top = 0;
        int left = 0;
        int buttom = input[0].length - 1;
        int right = input.length - 1;
        int indexArray = 0;
        for (; indexArray < countMatrix; ) {
            for (int i = top; i <= buttom; i++) {
                array[indexArray] = input[left][i];
                indexArray++;
            }
            if (indexArray == countMatrix) {
                return array;
            }
            left++;
            for (int i = left; i <= right; i++) {
                array[indexArray] = input[i][buttom];
                indexArray++;
            }
            if (indexArray == countMatrix) {
                return array;
            }
            buttom--;
            for (int i = buttom; i >= top; i--) {
                array[indexArray] = input[right][i];
                indexArray++;
            }
            if (indexArray == countMatrix) {
                return array;
            }
            right--;
            for (int i = right; i >= left; i--) {
                array[indexArray] = input[i][top];
                indexArray++;
            }
            if (indexArray == countMatrix) {
                return array;
            }
            top++;
        }
        return array;
    }
}
