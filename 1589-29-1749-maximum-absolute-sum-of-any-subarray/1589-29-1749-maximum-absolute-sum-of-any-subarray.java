class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxSum = 0, minSum = 0, maxAbsSum = 0;
        
        for (int num : nums) {
            maxSum = Math.max(num, maxSum + num);  // Tracks max subarray sum
            minSum = Math.min(num, minSum + num);  // Tracks min subarray sum
            maxAbsSum = Math.max(maxAbsSum, Math.max(maxSum, Math.abs(minSum)));
        }
        
        return maxAbsSum;
    }
}
