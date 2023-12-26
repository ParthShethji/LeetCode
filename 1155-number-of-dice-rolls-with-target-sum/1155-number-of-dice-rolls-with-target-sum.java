class Solution {
    
    private int M = 1000000007;
    
    public int numRollsToTarget(int n, int k, int target) {
        return helper(n, k, target, new Integer[n + 1][target + 1]);
    }
    
    private int helper(int n, int k, int target, Integer[][] dp) {
        if (n == 0) {
            return target == 0 ? 1 : 0;
        }
        if (n > target || n * k < target) {
            return 0;
        }
        if (dp[n][target] != null) {
            return dp[n][target];
        }
        int res = 0;
        for (int i = 1; i <= k; i++) {
            res = (res + helper(n - 1, k, target - i, dp)) % M;
        }
        dp[n][target] = res;
        return dp[n][target];
    }
}