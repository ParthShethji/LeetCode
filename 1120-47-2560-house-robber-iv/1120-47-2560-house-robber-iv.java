class Solution {
    public int minCapability(int[] nums, int k) {
        int min = 1, max = Arrays.stream(nums).max().getAsInt(), totalHouses = nums.length;
        while(min<max){
            int mid = (min + max) / 2;
            int possibleThefts = 0;
            for(int i=0; i<totalHouses; ++i){
                if (nums[i] <= mid) {
                    possibleThefts += 1;
                    i++;
                }
            }
            if(possibleThefts>=k)   max = mid;
            else{
                min = mid+1;
            }
        }
        return min;
    }
}