import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(Parameterized.class)
public class AddDigitsTest {
    @Parameterized.Parameter(value = 0)
    public int num;
    @Parameterized.Parameter(value = 1)
    public int expected;

    @Parameterized.Parameters(name = "{index}: addDigits({0})={1}")
    public static Iterable<Object[]> testData() {
        return Arrays.asList(new Object[][]{
                {0, 0},
                {2, 2},
                {11, 2},
                {123, 6},
                {576, 9}
        });
    }

    @Test
    public void testAddDigits() {
        Assert.assertEquals(expected, AddDigits.addDigits(num));
    }
}