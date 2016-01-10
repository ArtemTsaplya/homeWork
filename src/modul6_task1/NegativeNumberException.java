package modul6_task1;

public class NegativeNumberException extends Exception {
    private int number;

    public NegativeNumberException(int number) {
        this.number = number;
    }
}
