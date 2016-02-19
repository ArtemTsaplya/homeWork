package modul4_task2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class TemperatureTest {
    private static Temperature temperature;
    @BeforeClass
    public static void setUpClass() throws Exception {
        temperature = new Temperature();
    }

    @Test
    public void testConverterToFahrenheit() throws Exception {
        int celsiuse = 20;
        int result = 68;
        double resultToConvert = temperature.converterToFahrenheit(celsiuse);
        Assert.assertEquals(resultToConvert, result, 5);
    }

    @Test
    public void testConverterToCelsius() throws Exception {
        int celsiuse = 68;
        int result = 20;
        double resultToConvert = temperature.converterToCelsius(celsiuse);
        Assert.assertEquals(resultToConvert, result, 5);
    }
}