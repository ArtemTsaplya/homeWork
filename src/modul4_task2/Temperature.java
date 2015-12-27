package modul4_task2;

public class Temperature {
    private double temperatureFahrenheit, temperatureCelsius;

    public double getTemperatureFahrenheit() {
        return temperatureFahrenheit;
    }

    public double getTemperatureCelsius() {
        return temperatureCelsius;
    }

    public void temperatureConvert(double temperature){

            temperatureFahrenheit = (temperature * 1.8) + 32;
            System.out.println(temperatureFahrenheit + " градусов по Фаренгейту.");

            temperatureCelsius = (temperatureFahrenheit - 32) / 1.8;
            System.out.println(temperatureCelsius + " гадусов по Цельсию.");

        }
}
