class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int count =0;
        int candidate = nums[0];
        for(int i: nums){
            if(candidate == i){
                count++;
            }
            else{
                if(count ==0)    candidate = i;
                else{
                    count--;}
            }
        }
        return candidate;
    }
};