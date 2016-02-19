package modul_10_11;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class EncodeDecodeForTextTest {
    public static EncodeDecodeForText textTest;

    @BeforeClass
    public static void setUp() throws Exception {
        textTest = new EncodeDecodeForText();
    }

    @Test(timeout = 1000)
    public void testEncodeForText() throws Exception {
        final String enterText = "abc";
        final String resultText = "def";
        final int mod = 3;
        String textEncodeForAssert = textTest.encodeForText(enterText, mod);
        Assert.assertEquals(resultText, textEncodeForAssert);
    }

    @Test(timeout = 1000)
    public void testDecodeForText() throws Exception {
        final String enterText = "def";
        final String resultText = "abc";
        final int mod = 3;
        String textDecodeForAssert = textTest.decodeForText(enterText, mod);
        Assert.assertEquals(textDecodeForAssert, resultText);
    }
}