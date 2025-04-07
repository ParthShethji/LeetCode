class Solution {
    public boolean canPartition(int[] nums) {
        int total = 0;
        for (int i : nums) total += i;

        // If total sum is odd, can't partition
        if (total % 2 != 0) return false;
        
        int n = nums.length;
        int sum = total / 2;

        boolean[][] dp = new boolean[n + 1][sum + 1];

        // Base case: sum = 0 is always possible
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        // Filling the DP table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                dp[i][j] = dp[i-1][j]; // not pick

                if (j >= nums[i-1]) {
                    dp[i][j] = dp[i][j] || dp[i-1][j - nums[i-1]]; // pick
                }
            }
        }

        return dp[n][sum]; // check at the end
    }
}
