// 3318. Find X-Sum of All K-Long Subarrays I
// https://leetcode.com/problems/find-x-sum-of-all-k-long-subarrays-i/

public class main {
    
     int n = nums.length;
        int[] result = new int[n - k + 1];

        for (int i = 0; i <= n - k; i++) {
            Map<Integer, Integer> freq = new HashMap<>();

            // Count frequencies in the current window
            for (int j = i; j < i + k; j++) {
                freq.put(nums[j], freq.getOrDefault(nums[j], 0) + 1);
            }

            // Sort by decreasing frequency, then by decreasing number
            List<Map.Entry<Integer, Integer>> sortedFreq = new ArrayList<>(freq.entrySet());
            sortedFreq.sort((a, b) -> {
                if (!b.getValue().equals(a.getValue())) {
                    return b.getValue() - a.getValue();  // higher frequency first
                }
                return b.getKey() - a.getKey();  // if tie, higher value first
            });

            // Compute the x-sum
            int sum = 0, count = 0;
            for (Map.Entry<Integer, Integer> entry : sortedFreq) {
                if (count == x) break;
                sum += entry.getKey() * entry.getValue();
                count++;
            }

            result[i] = sum;
        }

        return result;
}
