package modul4_task1;

public class Main {
    public static void main(String[] args) {
        Figure fig = new Figure();
        final double areaCircle = fig.circle(3);
        final double areaRectangle = fig.rectangle(4,8);
        final double areaTriangle = fig.triangle(9, 17, 24);
        System.out.println("Площадь круга : " + areaCircle + ", площадь прямугольника : " + areaRectangle + ", площадь треугольника : " + areaTriangle);
    }
}
