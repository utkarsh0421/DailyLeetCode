// 2654. Minimum Number of Operations to Make All Array Elements Equal to 1
// https://leetcode.com/problems/minimum-number-of-operations-to-make-all-array-elements-equal-to-1/

public class main {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int countOfOnes = 0;
        for (int num : nums) {
            if (num == 1) {
                countOfOnes++;
            }
        }
        if (countOfOnes > 0) {
            return n - countOfOnes;
        }

        int minSubarrayLength = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int gcdValue = nums[i];
            for (int j = i + 1; j < n; j++) {
                gcdValue = gcd(gcdValue, nums[j]);
                if (gcdValue == 1) {
                    minSubarrayLength = Math.min(minSubarrayLength, j - i + 1);
                    break;
                }
            }
        }

        if (minSubarrayLength == Integer.MAX_VALUE) {
            return -1;
        } else {
            return n - 1 + (minSubarrayLength - 1);
        }
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
