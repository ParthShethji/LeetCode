class Solution {
    public String reversePrefix(String word, char ch) {
        int count = 0;
        while (count < word.length() && word.charAt(count) != ch) {
            count++;
        }
        if (count == word.length()) {
            return word; // If the character is not found, return the original string
        }
        count++;
        char[] chars = word.toCharArray();
        for (int i = 0; i < count / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[count - i - 1];
            chars[count - i - 1] = temp;
        }
        return new String(chars);
    }
}
