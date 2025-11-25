// 1018. Binary Prefix Divisible By 5
// https://leetcode.com/problems/binary-prefix-divisible-by-5/

import java.util.ArrayList;
import java.util.List;

public class main{
    public List<Boolean> prefixesDivBy5(int[] A) {
         List<Boolean> result = new ArrayList<>();
        int num = 0;

        for (int bit : nums) {  // ✅ use nums, not A
            num = ((num << 1) + bit) % 5;
            result.add(num == 0);
        }
        return result;
    }
}