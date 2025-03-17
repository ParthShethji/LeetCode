class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
                            map.put(i, map.getOrDefault(i,0)+1);

            if(map.containsKey(i)){
                if(map.get(i)==2)  map.remove(i);
            }
        }
        return map.size()==0;
    }
}