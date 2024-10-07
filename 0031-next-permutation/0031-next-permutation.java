class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length, p=n-2;
        while(p>=0 && nums[p]>=nums[p+1]){
            p--;
        }
    if(p>=0){
       int q = n-1;
        while(nums[q]<=nums[p]){
            q--;
        }
        swap(nums, p, q);
    }
        
        reverse(nums, p+1);
        }
    
    public void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    
    public void reverse(int[] nums, int start){
            int end = nums.length-1;
            while(start<end){
                swap(nums, start, end);
                start++;
                end--;
            }
    }
}