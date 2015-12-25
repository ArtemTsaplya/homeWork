package modul4_task1;


import modul4_task1.figure.Circle;
import modul4_task1.figure.Rectangle;
import modul4_task1.figure.Triangle;

public class Main {
    public static void main(String[] args) {
        Circle circ = new Circle(6);
        System.out.println("Площадь круга : " + circ.circle());

        Rectangle rect = new Rectangle(7, 15);
        System.out.println("Площадь прямоугольника : " + rect.rectangle());

        Triangle tria = new Triangle(25, 14, 31);
        System.out.println("Площадь треугольника : " + tria.triangle());

    }
}
