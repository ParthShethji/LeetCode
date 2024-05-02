class Solution {
    public int findMaxK(int[] nums) {
        // Arrays.sort(nums);
        // int i = 0;
        // int end = nums.length-1;
        // while(nums[i]<0){
        //     if(Math.abs(nums[i])==Math.abs(nums[end]))  return nums[end];
        //     else if(Math.abs(nums[i])>Math.abs(nums[end]))   i++;
        //     else end--;
        // }
        // return -1;
        HashSet<Integer> set = new HashSet<>();
        int max = -1;

        // Iterate through the array to populate the HashSet
        for (int num : nums) {
            set.add(num);
        }

        // Iterate through the array again to find the largest positive integer
        for (int num : nums) {
            if (num > 0 && set.contains(-num)) {
                max = Math.max(max, num);
            }
        }

        return max;

    }
}