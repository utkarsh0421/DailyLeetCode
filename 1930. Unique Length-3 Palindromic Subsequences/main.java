// 1930. Unique Length-3 Palindromic Subsequences
// https://leetcode.com/problems/unique-length-3-palindromic-subsequences/

public class main {
    public int countPalindromicSubsequence(String s) {
        int count = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            int first = s.indexOf(c);
            int last = s.lastIndexOf(c);
            if (first != -1 && last != -1 && first < last) {
                count += (int) s.substring(first + 1, last).chars().distinct().count();
            }
        }
        return count;
    }
}