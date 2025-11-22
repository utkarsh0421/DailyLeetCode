// 3190. Find Minimum Operations to Make All Elements Divisible by Three
// https://leetcode.com/problems/find-minimum-operations-to-make-all-elements-divisible-by-three/description/

public class main {
    public int minOperations(int[] nums) {
       int ops = 0;
        for (int num : nums) {
            if (num % 3 != 0) ops++;
        }
        return ops;
    }
}
