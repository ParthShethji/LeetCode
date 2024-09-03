class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCon = 0, currCount = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                currCount++;
                maxCon = Math.max(currCount, maxCon);
            } else{
                            currCount=0;
            }
        }
        return maxCon;
    }
}