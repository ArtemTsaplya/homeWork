package modul6_task1;

public class MyAge {
    public void myAge(int age) throws AgeException{
        if (age < 0){
            throw new AgeException(age);
        }
    }
}
