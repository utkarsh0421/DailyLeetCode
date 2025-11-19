// 2154. Keep Multiplying Found Values by Two
// https://leetcode.com/problems/keep-multiplying-found-values-by-two/

public class main {
    public int findFinalValue(int[] nums, int original) {
        boolean found = true;
        while (found) {
            found = false;
            for (int num : nums) {
                if (num == original) {
                    original *= 2;
                    found = true;
                    break;
                }
            }
        }
        return original;
    }
}
