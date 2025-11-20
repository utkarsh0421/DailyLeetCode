// 757. Set Intersection Size At Least Two
// https://leetcode.com/problems/set-intersection-size-at-least-two/description/

public class main {
    public int intersectionSizeTwo(int[][] intervals) {
         Arrays.sort(intervals, (a, b) -> 
            a[1] == b[1] ? b[0] - a[0] : a[1] - b[1]
        );

        int first = -1, second = -1; // last two chosen numbers
        int count = 0;

        for (int[] it : intervals) {
            int start = it[0], end = it[1];

            // case 1: no overlap
            if (start > second) {
                count += 2;
                first = end - 1;
                second = end;
            }
            // case 2: partial overlap (one covered)
            else if (start > first) {
                count += 1;
                first = second;
                second = end;
            }
            // case 3: fully covered → do nothing
        }

        return count;
    }
}
