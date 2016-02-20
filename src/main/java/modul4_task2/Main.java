package modul4_task2;

public class Main {
    public static void main(String[] args) {
        Temperature temp = new Temperature();
        double temperatureCelsius = temp.converterToFahrenheit(72.3);
        double temperatureFahrenheit = temp.converterToCelsius(132.5);
        System.out.println(temperatureCelsius);
        System.out.println(temperatureFahrenheit);
    }
}
