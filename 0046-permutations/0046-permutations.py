from typing import List

class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        ans = []
        used = set()

        def backtrack(temp):
            if len(temp) == len(nums):
                ans.append(temp[:])
                return

            for num in nums:
                if num in used:
                    continue

                temp.append(num)
                used.add(num)

                backtrack(temp)

                temp.pop()
                used.remove(num)

        backtrack([])
        return ans