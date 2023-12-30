class Solution {
    public boolean makeEqual(String[] words) {
              if (words.length == 1) {
			return true;
		}
		int totalCharCount = 0;
		for (String s : words) {
			totalCharCount += s.length();
		}
		if (totalCharCount % words.length != 0) {
						return false;
		}
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