/**
 * https://leetcode.com/problems/valid-number/
 */
public class ValidNumber {

    /**
     * 1481 / 1481 test cases passed.
     * Status: Accepted
     * Runtime: 56 ms
     *
     * @param s the string to test
     * @return true if the input string is a number, false otherwise
     */
    public static boolean isNumber(String s) {
        try {
            // to remove possible separator
            s = s.replaceAll(",", "");

            // to avoid float format values
            if (s.matches("[0-9.e-]*[a-zA-Z]$")) {
                return false;
            }

            // try to parse as a double
            double d = Double.parseDouble(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
