package petsCasting;

public class Main {
    public static void main(String[] args) {
        Pets pets = new Cat();
        PetsTreaning treaning = new PetsTreaning();
        treaning.petsSay(pets);
        ((Cat) pets).srat();

    }
}
