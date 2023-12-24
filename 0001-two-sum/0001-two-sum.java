class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> table = new HashMap<>();
        int n = nums.length;

        for(int i =0; i<n; i++){
            table.put(nums[i],i);
        }

        for(int i=0; i<n;i++){
            int remaining = target - nums[i];
            if(table.containsKey(remaining) && table.get(remaining) != i){
                return new int[]{i, table.get(remaining)};
            }
        }
        return new int[]{};
    }
    
}