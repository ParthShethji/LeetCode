class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        int i = s.length() - 1 , j = s.length();
        StringBuilder ans  = new StringBuilder();

        while( i >= 0){
            if(s.charAt(i) == ' '){
                String substr = s.substring(i+1 , j).trim();
                if(substr.length() > 0){
                         ans.append(substr);
                        ans.append(" ");
                }
               j =i;
            }


            i--;
        }
        ans.append(s.substring(i + 1 , j));
        return ans.toString();
    }
}