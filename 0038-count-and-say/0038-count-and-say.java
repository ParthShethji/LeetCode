class Solution {
    public String countAndSay(int n) {
        String s = "1";

        for (int i = 2; i <= n; i++) {
            s = countAndAdd(s);
        }

        return s;
    }

    public String countAndAdd(String s) {
        StringBuilder result = new StringBuilder();
        char c = s.charAt(0);
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            } else {
                result.append(count).append(c);
                c = s.charAt(i);
                count = 1;
            }
        }

        result.append(count).append(c);
        return result.toString();
    }
}