class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> reverse = new HashMap<>();
        String[] words = s.split(" ");
        if(pattern.length()!=words.length)   return false;
        for(int i=0; i<pattern.length(); i++){
            Character c = pattern.charAt(i);
            String word = words[i];
            if(map.containsKey(c)){
                if(!map.get(c).equals(word)){
                    return false;
                }
            }
            else{
                if(reverse.containsKey(word))   return false;
                map.put(c,word);
                reverse.put(word,c);
            }
        }
        return true;
    }
}