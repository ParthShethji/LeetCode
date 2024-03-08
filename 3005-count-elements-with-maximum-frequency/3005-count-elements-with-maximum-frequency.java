class Solution {
    public int maxFrequencyElements(int[] nums) {
        int max = 1;
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i : nums) {
            if (map.containsKey(i)) {
                int newFrequency = map.get(i) + 1;
                map.put(i, newFrequency);
                max = Math.max(max, newFrequency);
            } else {
                map.put(i, 1);
            }
        }
        
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (max == entry.getValue()) {
                count++;
            }
        }
        
        return count * max;
    }
}