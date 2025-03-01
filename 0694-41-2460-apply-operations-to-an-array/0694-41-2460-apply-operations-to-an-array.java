class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                nums[i]= nums[i]*2;
                nums[i+1] = 0;
            }
        }
        // int start = 0, end = nums.length-1;
        // while(start<end){
        //     if(nums[start]!=0)  start++;
        //     if(nums[end]==0)    end--;
        //     if(nums[start]==0 && nums[end]!=0){
        //         int temp = nums[start];
        //         nums[start] = nums[end];
        //         nums[end] = temp;
        //         start++;
        //         end--;
        //     }
        // }
        // return nums;
                int index = 0; // Pointer to track position for non-zero elements

        for (int num : nums) {
            if (num != 0) {
                nums[index++] = num;
            }
        }

        Arrays.fill(nums, index, nums.length, 0);
        return nums;
        
        
    }
}