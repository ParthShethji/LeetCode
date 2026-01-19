class Solution {
public:
    int maxSideLength(vector<vector<int>>& mat, int threshold) {
        int m = mat.size();
        int n = mat[0].size();

        // Step 1: Build prefix sum
        vector<vector<int>> pref(m + 1, vector<int>(n + 1, 0));

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                pref[i][j] = mat[i - 1][j - 1]
                           + pref[i - 1][j]
                           + pref[i][j - 1]
                           - pref[i - 1][j - 1];
            }
        }

        // Step 2: Binary search on side length
        int low = 0, high = min(m, n);
        int ans = 0;

        while (low <= high) {
            int k = (low + high) / 2;
            bool found = false;

            for (int i = k; i <= m && !found; i++) {
                for (int j = k; j <= n; j++) {
                    int sum = pref[i][j]
                            - pref[i - k][j]
                            - pref[i][j - k]
                            + pref[i - k][j - k];

                    if (sum <= threshold) {
                        found = true;
                        break;
                    }
                }
            }

            if (found) {
                ans = k;
                low = k + 1;
            } else {
                high = k - 1;
            }
        }

        return ans;
    }
};
