class Solution {
    public String customSortString(String order, String s) {
        StringBuilder ans = new StringBuilder();
        int[] frequency = new int[26]; // Assuming only lowercase letters
        
        // Count the frequency of each character in s
        for (char c : s.toCharArray()) {
            frequency[c - 'a']++;
        }
        
        // Append characters in the order specified by 'order'
        for (char c : order.toCharArray()) {
            while (frequency[c - 'a'] > 0) {
                ans.append(c);
                frequency[c - 'a']--;
            }
        }
        
        // Append remaining characters not present in 'order'
        for (char c = 'a'; c <= 'z'; c++) {
            while (frequency[c - 'a'] > 0) {
                ans.append(c);
                frequency[c - 'a']--;
            }
        }
        
        return ans.toString();
    }
}
