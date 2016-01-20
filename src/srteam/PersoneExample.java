package srteam;

import java.util.ArrayList;
import java.util.List;

public class PersoneExample {
    public static void main(String[] args) {
        List<Persone> person = new ArrayList<>();
        person.add(new Persone("Artem", "Tsaplya",(byte) 24));
        person.add(new Persone("Lera", "Dyndyk",(byte) 21));
        person.add(new Persone("Lesha", "Slyvets",(byte) 25));

        person.stream().forEach(persone -> System.out.println(persone));
    }
}
