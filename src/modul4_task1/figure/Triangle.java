package modul4_task1.figure;

public class Triangle {
    private int sideA, sideB, angel;
    public double area;

    public Triangle(int sideA, int sideB, int angel) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.angel = angel;
    }

    public double triangle(){
        area = sideA*sideB*Math.sin(Math.toRadians(angel))/2;
        return area;
    }



}
