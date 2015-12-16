/**
 * https://leetcode.com/problems/add-digits/
 */
public class AddDigits {

    /**
     * 1101 / 1101 test cases passed.
     * Status: Accepted
     * Runtime: 5 ms
     *
     * @param num the number to compute
     * @return the sum of all digit operations until only one digit remains
     */
    public static int addDigits(int num) {
        char[] str = String.valueOf(num).toCharArray();
        int res = 0;

        for (int i = 0; i < str.length; i++) {
            res += Integer.parseInt("" + str[i]);
        }

        if (str.length == 1) {
            return res;
        } else {
            return addDigits(res);
        }
    }
}
