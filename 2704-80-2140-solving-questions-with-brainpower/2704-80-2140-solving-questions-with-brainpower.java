class Solution {
    public long mostPoints(int[][] questions) {
        int n = questions.length;
        long[] dp = new long[n + 1]; // DP array initialized to 0

        for (int i = n - 1; i >= 0; i--) {
            int index = i + questions[i][1] + 1; // Compute next valid question
            dp[i] = Math.max(dp[i + 1], index < dp.length ? questions[i][0] + dp[index] : questions[i][0]);
        }

        return dp[0]; // Maximum points starting from the first question
    }
}
