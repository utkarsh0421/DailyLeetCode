// 717. 1-bit and 2-bit Characters
// https://leetcode.com/problems/1-bit-and-2-bit-characters/

public class main {
    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length;
        int i = 0;
        while (i < n - 1) {
            if (bits[i] == 0) {
                i++;
            } else {
                i += 2;
            }
        }
        return i == n - 1;
    }
}
