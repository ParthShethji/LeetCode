class Solution {
    public int majorityElement(int[] nums) {
    int count = 0, maxEl = nums[0];   

        for (int i = 0; i < nums.length; i++) 
        {
            if (count == 0) 
            {
                maxEl = nums[i];
                count++;
            } 
            else if (maxEl == nums[i]) 
            {
                count++;
            } 
            else 
            {
                count--;
            }
        }
        return maxEl;
    }
}