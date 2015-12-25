package modul4_task1.figure;

public class Rectangle {
    private int sideA, sideB;
    public int area;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int rectangle(){
        area = sideA * sideB;
        return area;
    }

}
