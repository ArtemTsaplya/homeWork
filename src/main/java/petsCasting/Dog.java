package petsCasting;

public class Dog implements Pets {
    @Override
    public void say() {
        System.out.println("Gaw!");
    }
}
