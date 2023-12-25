class Solution {
    public int numDecodings(String s) {
        return helper(s,0);
    }
    Map<Integer, Integer> map = new HashMap<>();
    
    private int helper(String s, int i){
        if(s.length()<=i)   return 1;
        if(s.charAt(i)=='0')    return 0;
        if(map.containsKey(i)) return map.get(i);
        int ways = helper(s, i+1);
        if(i+2<=s.length() && Integer.parseInt(s.substring(i, i+2))<=26){
            ways+=helper(s, i+2);
            map.put(i, ways);
        }
        return ways;
    }
}