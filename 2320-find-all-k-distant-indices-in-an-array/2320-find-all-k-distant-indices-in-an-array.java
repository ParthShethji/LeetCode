import java.util.*;

class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        boolean[] isValid = new boolean[n];

        // Step 1: For every index j where nums[j] == key,
        // mark all indices i such that |i - j| <= k
        for (int j = 0; j < n; j++) {
            if (nums[j] == key) {
                int start = Math.max(0, j - k);
                int end = Math.min(n - 1, j + k);
                for (int i = start; i <= end; i++) {
                    isValid[i] = true;
                }
            }
        }

        // Step 2: Collect all valid indices
        for (int i = 0; i < n; i++) {
            if (isValid[i]) {
                result.add(i);
            }
        }

        return result; // Already in increasing order
    }
}
