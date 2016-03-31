package practic_3_1_foodForGnomes;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] gnames = {1, 6, 11, 22, 3, 1};
        int[] portions = {13, 60, 42, 2, 7, 1};
        Gnomes gnom = new Gnomes();
        int[] id = gnom.find(gnames, portions);
        System.out.println(Arrays.toString(id));
    }
}
