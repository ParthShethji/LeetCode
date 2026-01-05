class Solution {
public:
    long long maxMatrixSum(vector<vector<int>>& matrix) {
        long long total = 0;
        int negCount = 0;
        int minAbs = INT_MAX;
        bool hasZero = false;

        for (auto& row : matrix) {
            for (int x : row) {
                total += llabs(x);
                if (x < 0) negCount++;
                if (x == 0) hasZero = true;
                minAbs = min(minAbs, abs(x));
            }
        }

        if (hasZero || negCount % 2 == 0) {
            return total;
        }

        return total - 2LL * minAbs;
    }
};
