class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int index =2;
        if(nums.size()<=2)  return nums.size();
        for(int i=2; i<nums.size(); i++){
            // if(nums[index-2]==nums[i] && nums[index-1]==nums[i]){
            //     continue;
            // }
            if(nums[index-1]!=nums[i]){
                nums[index++]=nums[i];
            }
            else if(nums[index-1]==nums[i] && nums[index-2]!=nums[i]){
                nums[index++]=nums[i];
            }
        }
        return index;
    }
};