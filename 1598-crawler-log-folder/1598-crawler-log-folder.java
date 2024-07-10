class Solution {
    public int minOperations(String[] logs) {
        int ans =0;
        for(String s: logs){
            if(s.equals("../")){
                if (ans > 0) {
                    ans -= 1;
                }

            }
            else if(s.equals("./")){
                
            }
            else{
                ans += 1;
            }
        }
        return ans;
    }
}