package Caesar;


import java.util.Scanner;

public class CaesarCode {
     static char cha = 'd';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String code = scanner.nextLine();
        String [] codeArray = code.split(",");

        int[] numberArray  = new int [codeArray.length];

        for (int i = 0; i < codeArray.length; i++) {
            int a = Integer.valueOf(codeArray[i]);
            for ( int b=0; b<a; b++) {
                numberArray[b] = a++;
            }
        }
        for (int n: numberArray){
            System.out.println(n);
        }
    }

}
