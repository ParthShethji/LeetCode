class Solution {
    private static final int MOD = (int) (1e9 + 7); // Constant for modulo

    public int numRollsToTarget(int n, int k, int target) {
        // Handle invalid input
        if (n < 0 || k < 1 || target < 1) {
            throw new IllegalArgumentException("Invalid input values");
        }

        Integer[][] dp = new Integer[n + 1][target + 1];
        return helper(n, k, target, dp);
    }

    private int helper(int n, int k, int sum, Integer[][] dp) {
        if (n == 0) {
            return sum == 0 ? 1 : 0; // Base case: no dice left
        }

        if (dp[n][sum] != null) {
            return dp[n][sum];
        }

        int res = 0;
        for (int i = 1; i <= k && i <= sum; i++) { // Optimized loop
            res = (res + helper(n - 1, k, sum - i, dp)) % MOD;
        }

        dp[n][sum] = res;
        return res;
    }
}
