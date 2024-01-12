class Solution {
    public boolean halvesAreAlike(String s) {
        int length = s.length() / 2;
        int count = 0;

        for (int i = 0; i < length; i++) {
            char c = Character.toLowerCase(s.charAt(i)); // Convert to lowercase for case-insensitive comparison
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }

        for (int i = length; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count--;
            }
        }

        return count == 0;
    }
}
