// 3228. Maximum Number of Operations to Move Ones to the End
// https://leetcode.com/problems/maximum-number-of-operations-to-move-ones-to-the-end/description/

public class main {
    int n = s.length(), cnt = 0, ans = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                ans += cnt;
                while (i < n && s.charAt(i) != '1') {
                    i++;
                }
            }
            cnt++;
        }
        return ans;
}
