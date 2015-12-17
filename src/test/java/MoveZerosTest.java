import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(Parameterized.class)
public class MoveZerosTest {

    @Parameterized.Parameter(value = 0)
    public int[] nums;

    @Parameterized.Parameter(value = 1)
    public int[] expected;

    @Parameterized.Parameters(name = "{index}: moveZeros({0})={1}")
    public static Iterable<Object[]> testData() {
        return Arrays.asList(new Object[][]{
                {new int[]{5}, new int[]{5}},
                {new int[]{0, 5}, new int[]{5, 0}},
                {new int[]{0, 5, 0, 0}, new int[]{5, 0, 0, 0}},
                {new int[]{0, 1, 0, 3, 12}, new int[]{1, 3, 12, 0, 0}},
                {new int[]{0, 7, 0, 3, 0, 21, 23, 35, 12, 0}, new int[]{7, 3, 21, 23, 35, 12, 0, 0, 0, 0}}
        });
    }

    @Test
    public void testMoveZeros() {
        Assert.assertArrayEquals(expected, MoveZeros.moveZeroes(nums));
    }
}
