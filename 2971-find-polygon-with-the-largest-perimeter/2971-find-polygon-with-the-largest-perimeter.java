class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort (nums);
        int n= nums.length;
        long[] arr = new long [n];
        arr[0] = nums [0];
        for(int i= 1; i <n; i++){
            arr[i] = arr[i-1]+ nums[i];
        }
        for(int i= n-1; i >= 2; i--){
            if(nums[i] < arr[i-1]){
                return arr[i];
            }
        }
        return -1;
    }
}