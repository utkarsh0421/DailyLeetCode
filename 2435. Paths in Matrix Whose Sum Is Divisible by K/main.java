// 2435. Paths in Matrix Whose Sum Is Divisible by K
// https://leetcode.com/problems/paths-in-matrix-whose-sum-is-divisible-by-k/

public class main {
    class Solution {
        public int countPaths(int[][] grid, int k) {
            int m = grid.length, n = grid[0].length;
            int MOD = 1_000_000_007;

            // dp[i][j][r]: number of paths to (i,j) with sum % k == r
            int[][][] dp = new int[m][n][k];
            dp[0][0][grid[0][0] % k] = 1;

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    for (int r = 0; r < k; r++) {
                        if (i > 0) {
                            int newR = (r + grid[i][j]) % k;
                            dp[i][j][newR] = (dp[i][j][newR] + dp[i - 1][j][r]) % MOD;
                        }
                        if (j > 0) {
                            int newR = (r + grid[i][j]) % k;
                            dp[i][j][newR] = (dp[i][j][newR] + dp[i][j - 1][r]) % MOD;
                        }
                    }
                }
            }

            return dp[m - 1][n - 1][0];
        }
    }
}