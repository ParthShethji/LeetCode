class Solution {
    private static void helper(int start, String s, List<String> path, List<List<String>> ans){
        if(start==s.length()){
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int i=start; i<s.length(); ++i){
            if(palindrome(s, start, i)){
                path.add(s.substring(start, i+1));
                helper(i+1, s, path, ans);
                path.remove(path.size()-1);
            }
        }    
    }
    
    private static boolean palindrome(String s, int start, int end){
        while(start<=end){
            if(s.charAt(start++)!=s.charAt(end--))  return false;
        }
        return true;
    }
    
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>(); 
        List<String> path = new ArrayList<>();
        helper(0, s, path, ans);
        return ans;
    }
}