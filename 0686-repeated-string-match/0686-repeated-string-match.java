class Solution {
    public int repeatedStringMatch(String a, String b) {
        if (b.length() == 0) return 0;
        String temp = a;
        int repeat = b.length() / a.length();
        int count =1;
        for(int i=0; i<repeat+2; i++){
            if(a.contains(b))   return count;
            else{
                a += temp;
                count++;
            }
        }
        return -1;
    }
}
