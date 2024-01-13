class Solution {
        private static void helper(int start,int sum, int[] arr, int target, List<Integer> ds, List<List<Integer>>ans){
        if(sum==target){
            ans.add(new ArrayList(ds));
            return;
        }
        if(sum>target)  return;
        for(int i = start; i<arr.length; i++){
                        if (i > start && arr[i] == arr[i - 1]) {
                continue;
            }
            ds.add(arr[i]);
            helper(i+1, sum+arr[i], arr, target, ds, ans);
            ds.remove(ds.size()-1);
        }
    }
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        helper(0,0,candidates, target, new ArrayList<>(), ans);
        return ans;
    }
}