import java.util.*;

class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int length = n - k + 1;
        int[] res = new int[length];

        // frequency map for current window
        Map<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < k; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }

        res[0] = computeXSum(freq, x);

        // slide the window
        for (int i = k; i < n; i++) {
            int out = nums[i - k]; // element going out
            int in = nums[i];      // element coming in

            // decrease frequency of outgoing element
            freq.put(out, freq.get(out) - 1);
            if (freq.get(out) == 0) freq.remove(out);

            // increase frequency of incoming element
            freq.put(in, freq.getOrDefault(in, 0) + 1);

            // compute new x-sum
            res[i - k + 1] = computeXSum(freq, x);
        }

        return res;
    }

    private int computeXSum(Map<Integer, Integer> freq, int x) {
        List<int[]> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            list.add(new int[]{e.getKey(), e.getValue()});
        }

        list.sort((a, b) -> {
            if (a[1] == b[1]) return b[0] - a[0];
            return b[1] - a[1];
        });

        int sum = 0;
        int count = 0;
        for (int[] pair : list) {
            if (count == x) break;
            sum += pair[0] * pair[1];
            count++;
        }
        return sum;
    }
}
