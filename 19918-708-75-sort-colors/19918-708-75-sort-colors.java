class Solution {
            public void swap (int i, int j, int [] nums){
        int temp = nums[i];
         nums[i] =  nums[j];
         nums[j] = temp;
    }
    
    public void sortColors(int[] nums) {
        int i=0, j= 0, k= nums.length-1;
      while(j!=k){
          if(nums[j]==0){
              swap(i, j, nums);
              i++;
              j++;
          }
          else if(nums[j]==1)   j++;
          else if(nums[j]==2){
              swap(k, j, nums);
              k--;
          }
      }
        
        if(nums[j]==0){
              swap(i, j, nums);
          }
          else if(nums[j]==2){
              swap(k, j, nums);
          }
    
    }

}