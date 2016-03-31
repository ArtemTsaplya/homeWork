package practic_3_1_foodForGnomes;

import java.util.Arrays;

public class Gnomes {
    public int[] find(int[] gnames, int[] portions) {

        int[] gnomes2 = gnames.clone();
        Arrays.sort(gnomes2);
        for (int i = 0; i < gnomes2.length / 2; i++) {
            int temp = gnomes2[i];
            gnomes2[i] = gnomes2[gnomes2.length - 1 - i];
            gnomes2[gnomes2.length - 1 - i] = temp;
        }

        int[] portions2 = portions.clone();
        Arrays.sort(portions2);
        for (int i = 0; i < portions2.length / 2; i++) {
            int temp = portions2[i];
            portions2[i] = portions2[portions2.length - 1 - i];
            portions2[portions2.length - 1 - i] = temp;
        }

        int[] result = new int[gnames.length];
        int[] resultIndex = new int[gnames.length];
        int indexGnomes = 0;

        for (int k = 0; k < portions2.length; k++) {
            for (int g = 0; g < portions.length; g++) {
                if (portions2[k] == portions[g]) {
                    resultIndex[k] = g;
                    break;
                }
            }
        }

        for (int i = 0; i < gnomes2.length; i++) {
            for (int j = 0; j < gnames.length; j++) {
                if (gnomes2[i] == gnames[j]) {
                    indexGnomes = j;
                    break;
                }
            }
            result[indexGnomes] = resultIndex[i];
        }
        return result;
    }
}