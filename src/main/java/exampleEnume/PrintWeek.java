package exampleEnume;

public class PrintWeek {
    public void printDay() {
        for (DaysOfWeek day : DaysOfWeek.values()) {
            System.out.println(day);
        }
    }
}
