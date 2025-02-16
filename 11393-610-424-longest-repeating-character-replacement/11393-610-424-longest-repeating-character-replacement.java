class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> freq = new HashMap<>();
        int max = 0;
        int res =0;
        int start = 0;
        for(int i=0; i<s.length(); i++){
            char curr = s.charAt(i);
            freq.put(curr, freq.getOrDefault(curr,0)+1);
            max=Math.max(max, freq.get(curr));

            while(i-start+1-max>k){
                char left = s.charAt(start);
                freq.put(left, freq.get(left)-1);
                start++;
            }
            res = Math.max(res, i-start+1);
        }
        return res;
    }
}