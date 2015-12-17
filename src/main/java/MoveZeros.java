/**
 * https://leetcode.com/problems/move-zeroes/
 */
public class MoveZeros {

    /**
     * 21 / 21 test cases passed.
     * Status: Accepted
     * Runtime: 1 ms
     * Your runtime beats 23.96% of java submissions.
     *
     * @param nums the input array
     * @return This method returns the ordered array (the input array as
     * changes are done inplace), however the LeetCode platform method stub
     * does not return anything as it evaluates internally the value of nums.
     */
    public static int[] moveZeroes(int[] nums) {
        int firstZeroIndex = -1;
        int nonZeroIndex = -1;

        int tmpValue;

        for (int index = 0; index < nums.length; index++) {
            // assign value pointers
            if (nums[index] == 0) {
                if (firstZeroIndex == -1) {
                    firstZeroIndex = index;
                }
            } else {
                nonZeroIndex = index;
            }

            // move the values
            if (nonZeroIndex > firstZeroIndex
                    && nonZeroIndex != -1
                    && firstZeroIndex != -1) {
                tmpValue = nums[nonZeroIndex];
                nums[nonZeroIndex] = nums[firstZeroIndex];
                nums[firstZeroIndex] = tmpValue;

                // switch/assign new pointers
                nonZeroIndex = firstZeroIndex;
                firstZeroIndex++;
            }
        }

        return nums;
    }
}
