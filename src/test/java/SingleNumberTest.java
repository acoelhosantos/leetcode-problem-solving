import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(Parameterized.class)
public class SingleNumberTest {

    @Parameterized.Parameter(value = 0)
    public int[] nums;

    @Parameterized.Parameter(value = 1)
    public int expected;

    @Parameterized.Parameters(name = "{index}: singleNumber({0})={1}")
    public static Iterable<Object[]> testData() {
        return Arrays.asList(new Object[][]{
                {new int[]{5}, 5},
                {new int[]{0, 1, 1}, 0},
                {new int[]{0, 1, 0}, 1},
                {new int[]{1, 1, 2, 2, 3, 3, 4}, 4}
        });
    }

    @Test
    public void testSingleNumber() {
        Assert.assertEquals(expected, SingleNumber.singleNumber(nums));
    }
}
