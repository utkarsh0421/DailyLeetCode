// 1578. Minimum Time to Make Rope Colorful
// https://leetcode.com/problems/minimum-time-to-make-rope-colorful/description/

public class main {
    public int minCost(String colors, int[] neededTime) {
        int totalTime = 0;
        int n = colors.length();
        
        for (int i = 1; i < n; i++) {
            if (colors.charAt(i) == colors.charAt(i - 1)) {
                totalTime += Math.min(neededTime[i], neededTime[i - 1]);
                neededTime[i] = Math.max(neededTime[i], neededTime[i - 1]);
            }
        }
        
        return totalTime;
    }
}
