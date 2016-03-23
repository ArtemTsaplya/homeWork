package practic_1_snakeToMatrix;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SnakeToMatrix toSnake = new SnakeToMatrix();
        int[][] array = {{10, 45, 23}, {1, 4, 3}, {0, 5, 8}};
        int result[] = toSnake.snake(array);
        String arrayString = Arrays.toString(result);
        System.out.println(arrayString);
    }
}
