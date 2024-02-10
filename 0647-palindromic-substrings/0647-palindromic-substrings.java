class Solution {
    public int countSubstrings(String s) {
        int cnt = 0;
        char[] sArr = s.toCharArray();
        int n = sArr.length;
        for(int i=0; i<n; i++) {
            int oddCnt = getSSCnt(sArr, i, i, n);
            int evenCnt = getSSCnt(sArr, i, i+1, n);
            cnt += oddCnt + evenCnt;
        }
        return cnt;
    }

    private int getSSCnt(char[] sArr, int lo, int hi, int n) {
        int res = 0;
        while(lo >= 0 && hi < n && sArr[lo] == sArr[hi]) {
            res++;
            lo--;
            hi++;
        }
        return res;
    }
}