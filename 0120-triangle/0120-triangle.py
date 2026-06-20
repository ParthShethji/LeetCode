class Solution:
    def minimumTotal(self, triangle: List[List[int]]) -> int:
        n = len(triangle)

        dp = [[None] * len(row) for row in triangle]

        def helper(i, j):
            if i == n - 1:
                return triangle[i][j]

            if dp[i][j] is not None:
                return dp[i][j]

            down = helper(i + 1, j)
            diagonal = helper(i + 1, j + 1)

            dp[i][j] = triangle[i][j] + min(down, diagonal)

            return dp[i][j]

        return helper(0, 0)