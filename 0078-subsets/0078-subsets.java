class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>()); // start with an empty subset

        for (int num : nums) {
            int n = ans.size();
            for (int i = 0; i < n; i++) {
                List<Integer> newSubset = new ArrayList<>(ans.get(i));
                newSubset.add(num);
                ans.add(newSubset);
            }
        }

        return ans;
    }
}