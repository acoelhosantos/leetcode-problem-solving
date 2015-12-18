import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(Parameterized.class)
public class ContainsDuplicateTest {

    @Parameterized.Parameter(value = 0)
    public int[] nums;

    @Parameterized.Parameter(value = 1)
    public boolean expected;

    @Parameterized.Parameters(name = "{index}: containsDuplicate({0})={1}")
    public static Iterable<Object[]> testData() {
        return Arrays.asList(new Object[][]{
                {new int[]{5}, false},
                {new int[]{0, 1}, false},
                {new int[]{0, 0}, true},
                {new int[]{0, 1, 1}, true},
                {new int[]{0, 1, 0}, true},
                {new int[]{0, 1, 2, 3, 4}, false},
                {new int[]{1, 1, 2, 2, 3, 3, 4}, true}
        });
    }

    @Test
    public void testContainsDuplicate() {
        Assert.assertEquals(expected, ContainsDuplicate.containsDuplicate(nums));
    }
}
