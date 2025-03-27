class Solution {
    public int minimumIndex(List<Integer> nums) {
       HashMap<Integer, Integer> map = new HashMap<>();
       for(int num: nums){
        map.put(num, map.getOrDefault(num, 0)+1);
       } 
        int dominant = -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) { 
            if (entry.getValue() > (nums.size() + 1) / 2) {  
                dominant = entry.getKey();  
                break;
            } 
        }

      
        if(dominant ==-1)    return -1;
        int dc = 0; // Dominant count in left partition
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == dominant) {
                dc++;
                if (dc * 2 > (i + 1)) { // ✅ Adjusted condition to check proper partitioning
                    return i;
                }
            }
        }
        return -1;

    }
}