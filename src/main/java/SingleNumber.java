import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * https://leetcode.com/problems/single-number/
 */
public class SingleNumber {

    /**
     * 15 / 15 test cases passed.
     * Status: Accepted
     * Runtime: 30 ms
     * Your runtime beats 2.19% of java submissions.
     *
     * @param nums the input array of elements
     * @return the element that is not duplicated within the array
     */
    public static int singleNumber(int[] nums) {
        // fill an hashmap to help with counting
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        // check which element only has count == 1
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (Objects.equals(1, entry.getValue())) {
                return entry.getKey();
            }
        }

        // invalid
        return 0;
    }
}
