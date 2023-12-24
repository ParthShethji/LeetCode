class Solution {
    public int longestConsecutive(int[] nums) {
        int longest =0;
        int n = nums.length;
        if(n==0 || n==1)    return n;
        Set<Integer> set = new HashSet<>();
        for(int i: nums){
            set.add(i);
        }
        for(int i: set){
            if(!set.contains(i-1)){
                int count =1;
                int newStart = i;
                while(set.contains(newStart+1)){
                    count++;
                    newStart=newStart+1;
                }
                longest = Math.max(longest, count);
                
            }
        }
        return longest;
    }
}