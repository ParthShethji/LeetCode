class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        first = -1
        last = -1

        # Find first occurrence
        left = 0
        right = len(nums) - 1

        while left <= right:
            mid = (left + right) // 2

            if nums[mid] == target:
                if mid == 0 or nums[mid - 1] != target:
                    first = mid
                    break
                else:
                    right = mid - 1

            elif nums[mid] < target:
                left = mid + 1
            else:
                right = mid - 1

        # Find last occurrence
        left = 0
        right = len(nums) - 1

        while left <= right:
            mid = (left + right) // 2

            if nums[mid] == target:
                if mid == len(nums) - 1 or nums[mid + 1] != target:
                    last = mid
                    break
                else:
                    left = mid + 1

            elif nums[mid] < target:
                left = mid + 1
            else:
                right = mid - 1

        return [first, last]