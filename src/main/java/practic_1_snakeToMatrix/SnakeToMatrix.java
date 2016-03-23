package practic_1_snakeToMatrix;

public class SnakeToMatrix {

    public int[] snake(int[][] input) {
        int matrixCount = input.length * input[0].length;
        int arrayToMatrix[] = new int[matrixCount];
        int sizeArrayToMatrix = 0;
        for (int j = 0; j < input[0].length; j++) {
            for (int i = 0; i < input.length; i++) {
                arrayToMatrix[sizeArrayToMatrix] = input[i][j];
                sizeArrayToMatrix++;
            }
            j++;
            if (sizeArrayToMatrix == matrixCount) {
                return arrayToMatrix;
            }
            for (int i = input.length - 1; i >= 0; i--) {
                arrayToMatrix[sizeArrayToMatrix] = input[i][j];
                sizeArrayToMatrix++;
            }
            if (sizeArrayToMatrix == matrixCount) {
                return arrayToMatrix;
            }
        }
        return arrayToMatrix;
    }
}