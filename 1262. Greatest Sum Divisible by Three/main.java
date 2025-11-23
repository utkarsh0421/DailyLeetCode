// 1262. Greatest Sum Divisible by Three
// https://leetcode.com/problems/greatest-sum-divisible-by-three/

public class main {
    public int maxSumDivThree(int[] nums) {
        int[] dp = new int[3];
        for (int num : nums) {
            int[] temp = dp.clone();
            for (int i = 0; i < 3; i++) {
                int sum = temp[i] + num;
                dp[sum % 3] = Math.max(dp[sum % 3], sum);
            }
        }
        return dp[0];
    }
}
