class Solution:
    def minDistance(self, word1: str, word2: str) -> int:
        m, n = len(word1), len(word2)
        dp = [[-1] * (n + 1) for _ in range(m + 1)]

        def helper(i, j):
            # word1 exhausted -> insert remaining characters of word2
            if i == m:
                return n - j

            # word2 exhausted -> delete remaining characters of word1
            if j == n:
                return m - i

            if dp[i][j] != -1:
                return dp[i][j]

            # Characters match
            if word1[i] == word2[j]:
                dp[i][j] = helper(i + 1, j + 1)
            else:
                # Insert, Delete, Replace
                insert = helper(i, j + 1)
                delete = helper(i + 1, j)
                replace = helper(i + 1, j + 1)

                dp[i][j] = 1 + min(insert, delete, replace)

            return dp[i][j]

        return helper(0, 0)