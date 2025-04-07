class Solution {
    public boolean canPartition(int[] nums) {
        int total = 0;
        for (int num : nums) total += num;
        
        if (total % 2 != 0) return false; // If total sum is odd, can't partition

        int sum = total / 2;
        boolean[] dp = new boolean[sum + 1];
        dp[0] = true; // We can always make 0 sum with empty subset

        for (int num : nums) {
            for (int j = sum; j >= num; j--) {
                dp[j] = dp[j] || dp[j - num];
            }
        }

        return dp[sum];
    }
}
