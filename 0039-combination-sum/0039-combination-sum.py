class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        ans = []

        def backtrack(temp, curr, start):
            if curr == target:
                ans.append(temp[:])
                return
            if curr > target:
                return
            for i in range(start, len(candidates)):
                num  = candidates[i]
                temp.append(num)
                backtrack(temp, curr+num, i)
                temp.pop()
        backtrack([], 0, 0)
        return ans

