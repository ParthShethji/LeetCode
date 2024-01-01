class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int max =0, cookieIndex=s.length-1, childIndex = g.length-1;
        while(cookieIndex>=0 && childIndex>=0){
            if(s[cookieIndex]>=g[childIndex]){
                max++;
                cookieIndex--;
                childIndex--;
            }
            else{
                childIndex--;
            }
        }
        return max;
    }
}