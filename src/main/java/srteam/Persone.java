package srteam;

public class Persone {
    private String firstName;
    private String lastName;
    private byte age;

    public Persone(String firstName, String lastName, byte age) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public byte getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Persone{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
