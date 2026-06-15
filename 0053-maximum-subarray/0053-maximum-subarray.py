class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        curr_max = nums[0]
        ans = nums[0]

        for num in nums[1:]:
            curr_max = max(num, curr_max + num)
            ans = max(ans, curr_max)

        return ans