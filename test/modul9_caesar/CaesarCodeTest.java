package modul9_caesar;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CaesarCodeTest {
    final String string = "ab";
    final String stringChecking = "bc";
    final int mod = 1;
    static CaesarCode code;

    @BeforeClass
    public static void setUp() throws Exception {
        code = new CaesarCode();
    }

    @Test
    public void testCaesarEncode() throws Exception {
        final String result = code.caesarEncode(string, mod);
        Assert.assertEquals(stringChecking, result);
    }

    @Test
    public void testCaesarDecode() throws Exception {
        final String result = code.caesarDecode(stringChecking, mod);
        Assert.assertEquals(string, result);
    }
}