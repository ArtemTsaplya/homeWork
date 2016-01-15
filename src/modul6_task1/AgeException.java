package modul6_task1;

public class AgeException extends Exception {
    private int age;

    public AgeException(int age) {

        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
