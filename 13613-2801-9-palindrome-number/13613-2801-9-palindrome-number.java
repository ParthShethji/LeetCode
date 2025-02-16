class Solution {
    public boolean isPalindrome(int x) {
        
        String s = String.valueOf(x);
        int start = 0, end = s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }else{
                start++;
                end--;
            }
        }
        return true;
    }
}