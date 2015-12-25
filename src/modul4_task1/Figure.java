package modul4_task1;

public class Figure {
    double area;

    public void circle(int radius){
        area = Math.PI * Math.pow(radius, 2);
        System.out.println("Площадь круга : " + area);
    }
    public void rectangle(int weight, int height){
        area = weight * height;
        System.out.println("Площадь прямоугольника : " + area);
    }
    public void triangle(int weight, int height, int angle){
        area = weight * height * Math.sin(Math.toRadians(angle)/2);
        System.out.println("Площадь треугольника : " + area);
    }
}
