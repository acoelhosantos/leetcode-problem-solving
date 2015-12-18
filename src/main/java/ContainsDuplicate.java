import java.util.HashSet;

/**
 * https://leetcode.com/problems/contains-duplicate/
 */
public class ContainsDuplicate {

    /**
     * 16 / 16 test cases passed.
     * Status: Accepted
     * Runtime: 15 ms
     * Your runtime beats 39.26% of java submissions.
     *
     * @param nums the input array of values
     * @return true if array has duplicates, false otherwise
     */
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numSet = new HashSet<Integer>(nums.length);

        for (int num : nums) {
            if (numSet.contains(num)) {
                return true;
            } else {
                numSet.add(num);
            }
        }

        return false;
    }
}
