package practic_1;

public class SnakeToMatrix {
    int arrayToMatrix[] = null;

    public int[] snake(int[][] input) {
        int sizeArrayToMatrix = 0;
        for (int i = 0; i < input.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < input[j].length; j++) {
                    arrayToMatrix[sizeArrayToMatrix] = input[j][i];
                    sizeArrayToMatrix++;
                }
            } else {
                for (int j = input[i].length - 1; j >= 0; j--) {
                    arrayToMatrix[sizeArrayToMatrix] = input[j][i];
                    sizeArrayToMatrix++;
                }
            }
        }
        return arrayToMatrix;
    }
}