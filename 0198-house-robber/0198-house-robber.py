class Solution:
    def rob(self, nums: List[int]) -> int:
        n = len(nums)
        dp = [-1] * n

        def helper(i):
            if i >= n:
                return 0

            if dp[i] != -1:
                return dp[i]

            rob_current = nums[i] + helper(i + 2)
            skip_current = helper(i + 1)

            dp[i] = max(rob_current, skip_current)
            return dp[i]

        return helper(0)