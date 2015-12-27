package modul4_task1;

public class Figure {
    private double area;


    public double circle(int radius){
        area = Math.PI * Math.pow(radius, 2);
        return area;
    }
    public double rectangle(int weight, int height){
        area = weight * height;
        return area;
    }
    public double triangle(int weight, int height, int angle){
        area = weight * height * Math.sin(Math.toRadians(angle)/2);
        return area;

    }
}
