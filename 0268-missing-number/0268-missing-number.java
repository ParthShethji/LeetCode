class Solution {
    public int missingNumber(int[] nums) {
        int ans =0;
        int n= nums.length;
        for(int i: nums){
            ans += i;
        }
        
        int sum = (n)*(n+1)/2;
        return sum-ans;
    }
}