class Solution {
public:
    int minimumDeletions(string s) {
        int bCount = 0;   // number of 'b's seen so far
        int del = 0;      // minimum deletions so far

        for (char c : s) {
            if (c == 'b') {
                bCount++;
            } else { // c == 'a'
                del = min(del + 1, bCount);
            }
        }
        return del;
    }
};
