class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] lastIndex = new int[128]; //128 covers all ASCII chars
        int max = 0;
        int n = s.length();
          for (int start = 0, end = 0; end < n; end++) {
            char currentChar = s.charAt(end);
            start = Math.max(start, lastIndex[currentChar]);
            max = Math.max(max, end - start + 1);
            lastIndex[currentChar] = end + 1;
        }
        return max;
    }
}