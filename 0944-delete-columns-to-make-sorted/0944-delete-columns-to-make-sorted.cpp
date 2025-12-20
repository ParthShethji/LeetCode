class Solution {
public:
    int minDeletionSize(vector<string>& strs) {
        int rows = strs.size();
        int cols = strs[0].size();
        int deletions = 0;

        // loop over each column
        for (int c = 0; c < cols; c++) {
            // check if column is sorted
            for (int r = 1; r < rows; r++) {
                if (strs[r][c] < strs[r - 1][c]) {
                    deletions++;
                    break; // no need to check further rows
                }
            }
        }
        return deletions;
    }
};
