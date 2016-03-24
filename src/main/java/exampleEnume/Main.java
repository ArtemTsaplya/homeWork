package exampleEnume;

import exampleEnume.days.PrintWeek;
import exampleEnume.months.PrintMonths;

public class Main {
    public static void main(String[] args) {
        PrintWeek printWeek = new PrintWeek();
        printWeek.printDay();

        PrintMonths print = new PrintMonths();
        print.printMonths();
    }
}
