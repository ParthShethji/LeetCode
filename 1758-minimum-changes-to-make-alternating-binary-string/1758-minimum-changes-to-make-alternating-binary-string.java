class Solution {
    public int minOperations(String s) {
        int zero=0;
        for(int i=0; i<s.length(); i++){
            if(i%2==0){
                if(s.charAt(i)=='1'){
                zero++;
            }
            }
            else{
                if(s.charAt(i)=='0'){
                    zero++;
                }
            }
        }
        return Math.min(s.length()-zero, zero);
    }
}