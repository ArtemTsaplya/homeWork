package modul4_task2;

public class Temperature {
    private double temperature;

    public double converterToFahrenheit(double Celsiuse) {
        temperature = (Celsiuse * 1.8) + 32;
        return temperature;
    }

    public double converterToCelsius(double Fahrenheit) {
        temperature = (Fahrenheit - 32) / 1.8;
        return temperature;
    }
}
