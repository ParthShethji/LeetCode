import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) { // Fixed missing parenthesis
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        HashSet<Integer> hashSet = new HashSet<>();
        boolean flag = true;
        for (Map.Entry<Integer, Integer> mapElement : map.entrySet()) {
            if (!hashSet.add(mapElement.getValue())) {
                flag = false;
            }
        }
        return flag;
    }
}
