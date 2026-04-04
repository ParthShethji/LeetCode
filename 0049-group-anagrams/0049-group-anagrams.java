class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String word : strs){
            int[] freq = new int[26];
            for(char c : word.toCharArray()){
                freq[c - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for(int f : freq){
                sb.append(f).append("#");
            }
            String key = sb.toString();

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());
    }
}