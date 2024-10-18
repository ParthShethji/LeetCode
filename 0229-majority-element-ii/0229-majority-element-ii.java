class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1 = 0, count2 = 0;
        int ele1 = 0, ele2 = 0;
        int n = nums.length;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (count1 == 0 && nums[i] != ele2) {
                ele1 = nums[i];
                count1 = 1;
            } else if (count2 == 0 && nums[i] != ele1) {
                ele2 = nums[i];
                count2 = 1;
            } else if (nums[i] == ele1) {
                count1++;
            } else if (nums[i] == ele2) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }
        
        count1=0;
        count2=0;
        for(int i=0; i<n; i++){
            if(nums[i]==ele1)    count1++;
            else if(nums[i]==ele2)  count2++;
        }
        
        int third = n/3;
        if(count1>third)    ans.add(ele1);
        if(count2>third)    ans.add(ele2);

        // Return the candidates found
return ans;    }
}
