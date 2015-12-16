import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(Parameterized.class)
public class ValidNumberTest {
    @Parameterized.Parameter(value = 0)
    public String str;
    @Parameterized.Parameter(value = 1)
    public boolean expected;

    @Parameterized.Parameters(name = "{index}: validNumber({0})={1}")
    public static Iterable<Object[]> testData() {
        return Arrays.asList(new Object[][]{
                {"0", true},
                {" 0.1 ", true},
                {"abc", false},
                {"1 a", false},
                {"2e10", true},
                {".10", true},
                {"-.10", true},
                {"-20", true},
                {"1000,10", true},
                {"959440.94f", false},
                {"84656e656D", false},
                {"-788f", false}
        });
    }

    @Test
    public void testValidNumber() {
        Assert.assertEquals(expected, ValidNumber.isNumber(str));
    }
}