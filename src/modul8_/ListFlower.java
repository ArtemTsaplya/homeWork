package modul8_;

public class ListFlower {
    private String nameFlower;
    private String colorFlower;

    public ListFlower(String nameFlower, String colorFlower) {
        this.nameFlower = nameFlower;
        this.colorFlower = colorFlower;
    }

    public String getNameFlower() {
        return nameFlower;
    }

    public String getColorFlower() {
        return colorFlower;
    }

    @Override
    public String toString() {
        return "nameFlower= '" + nameFlower + '\'' + ", colorFlower= '" + colorFlower + '\'';
    }
}
