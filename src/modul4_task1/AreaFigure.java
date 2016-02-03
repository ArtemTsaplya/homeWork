package modul4_task1;

public class AreaFigure {
    public void areaFigure(){
        Figure fig = new Figure();
        double a = fig.circle(3);
        double b = fig.rectangle(4,8);
        double c = fig.triangle(9, 17, 24);
        System.out.println("Площадь круга : " + a + ", площадь прямугольника : " + b + ", площадь треугольника : " + c);

    }
}
