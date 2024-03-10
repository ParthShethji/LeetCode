import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersectionSet = new HashSet<>();
        
        // Add elements of nums1 to HashSet
        for(int num : nums1) {
            set.add(num);
        }
        
        // Iterate through nums2 to find common elements
        for(int num : nums2) {
            if(set.contains(num)) {
                intersectionSet.add(num);
            }
        }
        
        // Convert HashSet to array
        int[] result = new int[intersectionSet.size()];
        int index = 0;
        for(int num : intersectionSet) {
            result[index++] = num;
        }
        
        return result;
    }
}
