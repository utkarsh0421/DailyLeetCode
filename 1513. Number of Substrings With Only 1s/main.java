// 1513. Number of Substrings With Only 1s
// https://leetcode.com/problems/number-of-substrings-with-only-1s/

public class main {
    public int numSub(String s) {
        long count = 0;
        long result = 0;
        int mod = 1_000_000_007;

        for (char c : s.toCharArray()) {
            if (c == '1') {
                count++;
            } else {
                result = (result + (count * (count + 1)) / 2) % mod;
                count = 0;
            }
        }

        result = (result + (count * (count + 1)) / 2) % mod;

        return (int) result;
    }
}
