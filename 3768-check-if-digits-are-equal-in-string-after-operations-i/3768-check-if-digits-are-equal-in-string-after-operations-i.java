class Solution {
    public boolean hasSameDigits(String s) {
        // StringBuilder temp = new StringBuilder(s);
        while(s.length()>2){
            StringBuilder newTemp = new StringBuilder("");
            for (int i = 0; i < s.length() - 1; i++) {
                int new_num = ((s.charAt(i) - '0') + (s.charAt(i + 1) - '0'))%10;
                newTemp.append(new_num);
            }
            s = newTemp.toString();
        }
        return s.charAt(0)==s.charAt(1);
    }
}