class Solution {
    public boolean makeEqual(String[] words) {
       int[] map = new int[26];
        for(String s: words){
            for(char c: s.toCharArray()){
                int index = c-'a';
                map[index]++;                
            }
        }
        for(int i:map){
            if(i%words.length!=0){
                return false;
            }
        }
        return true;
    }
}