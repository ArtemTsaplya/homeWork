package exampleEnume.days;

public class PrintWeek {
    public void printDay() {
        for (DaysOfWeek day : DaysOfWeek.values()) {
            day.printDay();
        }
    }
}
