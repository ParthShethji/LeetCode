class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Character> reverse = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            Character t_char = t.charAt(i);
            Character s_char = s.charAt(i);
            if(map.containsKey(s_char)){
                if(map.get(s_char)!=t_char){
                    return false;
                }
            }
            else{
                if(reverse.containsKey(t_char)){
                    return false;
                }
                map.put(s_char,t_char);
                reverse.put(t_char,s_char);
            }
        }
        return true;
    }
}