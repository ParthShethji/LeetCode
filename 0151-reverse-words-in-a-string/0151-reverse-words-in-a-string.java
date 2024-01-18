class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String reversedString = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            int sub = i;
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }
            String word = s.substring(i + 1, sub + 1);
            if (word.equals("")) {
                continue;
            }
            reversedString += word + " ";
        }
        return reversedString.trim();
    }
}
