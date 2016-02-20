package modul5_task1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinMaxNumberTest {
    final static int array[] = {13, 3, 4,25};
    static MinMaxNumber minMax;

    @BeforeClass
    public static void testNumber(){
        minMax = new MinMaxNumber();
    }

    @Test
    public void testMinNumber() throws Exception {
        final int number = 3;
        final int result = minMax.minNumber(array);
        Assert.assertEquals(number, result);
    }

    @Test
    public void testMaxNumber() throws Exception {
        final int number = 25;
        final int result = minMax.maxNumber(array);
        Assert.assertEquals(number, result);

    }
}