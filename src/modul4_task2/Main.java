package modul4_task2;

public class Main {
    public static void main(String[] args) {
        Temperature tem = new Temperature(45, 'C');
        Temperature tem1 = new Temperature(66.4, 'F');
        tem.temperatureConvert();
        tem1.temperatureConvert();

    }
}
