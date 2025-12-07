class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count =0;
        int ptrg =0;
        int ptrs = 0;
        while(ptrg < g.length && ptrs<s.length){
            if(g[ptrg]<=s[ptrs]){
                ptrg++;
                count++;
            }
            ptrs++;
        }
        return count;
    }
}