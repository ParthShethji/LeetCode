class Solution {
    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>> ans = new ArrayList<>();
        permut(0, nums, ans);
        return ans;
    }
    
    public static void permut(int index, int[] nums, List<List<Integer>> ans){
        if(index==nums.length){
            List<Integer> ds = new ArrayList<>();
            for(int i=0; i<nums.length; i++){
                ds.add(nums[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=index; i<nums.length; i++){
            swap(i, index, nums);
            permut(index+1, nums, ans);
            swap(i, index, nums);
        }
    }
    
    public static void swap(int i, int index, int[] nums){
        int t = nums[i];
        nums[i]=nums[index];
        nums[index]=t;
    }
}