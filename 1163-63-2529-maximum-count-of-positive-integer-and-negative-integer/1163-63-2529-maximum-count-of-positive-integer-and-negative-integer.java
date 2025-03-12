class Solution {
    public int maximumCount(int[] nums) {
        int negCount = findFirstPositive(nums);
        int posCount = nums.length - findFirstNonPositive(nums);
        return Math.max(negCount, posCount);
    }

    private int findFirstPositive(int[] nums) {
        int start = 0, end = nums.length;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < 0) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    private int findFirstNonPositive(int[] nums) {
        int start = 0, end = nums.length;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] <= 0) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}
