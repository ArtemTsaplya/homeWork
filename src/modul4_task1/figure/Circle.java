package modul4_task1.figure;

public class Circle {
    private int radius;
    public double area;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double circle(){
        area = Math.PI * radius;
        return area;
    }

}
