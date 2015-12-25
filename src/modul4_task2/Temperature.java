package modul4_task2;

public class Temperature {
    public double temperatureFahrenheit, temperatureCelsius;
    public char c;
    public double temperature;

    public Temperature(double temperature, char c) {
        this.c = c;
        this.temperature = temperature;
    }

    public void temperatureConvert(){
        if (c == 'C'){
            temperatureFahrenheit = (temperature * 1.8) + 32;
            System.out.println(temperatureFahrenheit + " градусов по Фаренгейту.");
        } else if(c == 'F') {
            temperatureCelsius = (temperature - 32) / 1.8;
            System.out.println(temperatureCelsius + " гадусов по Цельсию.");
        }
    }
}
