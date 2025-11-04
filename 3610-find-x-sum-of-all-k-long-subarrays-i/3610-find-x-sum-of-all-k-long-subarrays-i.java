import java.util.*;

class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] res = new int[n - k + 1];

        Map<Integer, Integer> freq = new HashMap<>();

        // build the first window
        for (int i = 0; i < k; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }

        // compute first window's x-sum
        res[0] = computeXSum(freq, x);

        // slide the window
        for (int i = k; i < n; i++) {
            int out = nums[i - k];
            int in = nums[i];

            // update frequencies
            freq.put(out, freq.get(out) - 1);
            if (freq.get(out) == 0) freq.remove(out);
            freq.put(in, freq.getOrDefault(in, 0) + 1);

            res[i - k + 1] = computeXSum(freq, x);
        }

        return res;
    }

    // helper to compute the x-sum efficiently using a heap
    private int computeXSum(Map<Integer, Integer> freq, int x) {
        Comparator<int[]> cmp = (a, b) -> {
            if (a[1] == b[1]) return b[0] - a[0];
            return b[1] - a[1];
        };

        PriorityQueue<int[]> pq = new PriorityQueue<>(cmp);
        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            pq.offer(new int[]{e.getKey(), e.getValue()});
        }

        long sum = 0;
        int count = 0;
        while (!pq.isEmpty() && count < x) {
            int[] p = pq.poll();
            sum += (long)p[0] * p[1];
            count++;
        }

        return (int)sum;
    }
}
