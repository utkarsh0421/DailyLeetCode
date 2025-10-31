// 3289. The Two Sneaky Numbers of Digitville
// https://leetcode.com/problems/the-two-sneaky-numbers-of-digitville/description/

public class main {
    public int[] findSneakyNumbers(int n) {
          Set<Integer> seen = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                duplicates.add(num);
            } else {
                seen.add(num);
            }
        }

        return new int[]{duplicates.get(0), duplicates.get(1)};
    }
}
