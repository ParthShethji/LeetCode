class Solution {
public:
    int largestMagicSquare(vector<vector<int>>& grid) {
        int m = grid.size();
        int n = grid[0].size();

        // Prefix sums for rows
        vector<vector<int>> rowPref(m, vector<int>(n + 1, 0));
        // Prefix sums for columns
        vector<vector<int>> colPref(m + 1, vector<int>(n, 0));

        // Build prefix sums
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rowPref[i][j + 1] = rowPref[i][j] + grid[i][j];
                colPref[i + 1][j] = colPref[i][j] + grid[i][j];
            }
        }

        int maxK = min(m, n);

        // Try largest k first
        for (int k = maxK; k >= 2; k--) {
            for (int i = 0; i + k <= m; i++) {
                for (int j = 0; j + k <= n; j++) {

                    // Target sum: first row
                    int target = rowPref[i][j + k] - rowPref[i][j];
                    bool ok = true;

                    // Check all rows
                    for (int r = i; r < i + k && ok; r++) {
                        int rowSum = rowPref[r][j + k] - rowPref[r][j];
                        if (rowSum != target) ok = false;
                    }

                    // Check all columns
                    for (int c = j; c < j + k && ok; c++) {
                        int colSum = colPref[i + k][c] - colPref[i][c];
                        if (colSum != target) ok = false;
                    }

                    // Check main diagonal
                    int diag1 = 0, diag2 = 0;
                    for (int d = 0; d < k; d++) {
                        diag1 += grid[i + d][j + d];
                        diag2 += grid[i + d][j + k - 1 - d];
                    }

                    if (diag1 != target || diag2 != target) ok = false;

                    if (ok) return k;
                }
            }
        }

        return 1;  
    }
};
