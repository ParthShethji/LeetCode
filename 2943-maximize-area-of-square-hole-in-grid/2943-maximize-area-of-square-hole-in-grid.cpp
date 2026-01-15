class Solution {
public:
    int maximizeSquareHoleArea(int n, int m, vector<int>& hBars, vector<int>& vBars) {
        sort(hBars.begin(), hBars.end());
        sort(vBars.begin(), vBars.end());

        int hor_seq = 1;
        int max_hor_seq = 1;
        for (int i = 1; i < hBars.size(); i++) {
            if (hBars[i] == hBars[i - 1] + 1) {
                hor_seq++;
            } else {
                max_hor_seq = max(max_hor_seq, hor_seq);
                hor_seq = 1;
            }
        }
        max_hor_seq = max(max_hor_seq, hor_seq);

        int ver_seq = 1;
        int max_ver_seq = 1;
        for (int i = 1; i < vBars.size(); i++) {
            if (vBars[i] == vBars[i - 1] + 1) {
                ver_seq++;
            } else {
                max_ver_seq = max(max_ver_seq, ver_seq);
                ver_seq = 1;
            }
        }
        max_ver_seq = max(max_ver_seq, ver_seq);

        int sq_side = min(max_hor_seq + 1, max_ver_seq + 1);
        return sq_side * sq_side;
    }
};
