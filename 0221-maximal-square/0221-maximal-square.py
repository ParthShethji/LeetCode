class Solution:
    def maximalSquare(self, matrix: List[List[str]]) -> int:
        if matrix is None or len(matrix) < 1:
            return 0

        m = len(matrix)
        n = len(matrix[0])

        dp = [0] * (n + 1)
        ans = 0

        for i in range(m):
            prev = 0      # represents dp[i][0]

            for j in range(n):
                temp = dp[j + 1]   # save dp[i][j+1] (top)

                if matrix[i][j] == "1":
                    dp[j + 1] = min(
                        prev,      # dp[i][j]
                        dp[j],     # dp[i+1][j]
                        temp       # dp[i][j+1]
                    ) + 1

                    ans = max(ans, dp[j + 1])
                else:
                    dp[j + 1] = 0

                prev = temp

        return ans * ans