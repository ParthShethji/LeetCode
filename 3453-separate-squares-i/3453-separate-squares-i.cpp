#include <vector>
#include <algorithm>
using namespace std;

class Solution {
public:
    double separateSquares(vector<vector<int>>& squares) {
        double low = 1e9, high = -1e9;
        double totalArea = 0;

        // Determine search range and total area
        for (auto& sq : squares) {
            double y = sq[1];
            double l = sq[2];
            low = min(low, y);
            high = max(high, y + l);
            totalArea += l * l;
        }

        // Binary search on y-coordinate
        for (int iter = 0; iter < 100; iter++) {
            double mid = (low + high) / 2.0;
            double below = 0;

            for (auto& sq : squares) {
                double y = sq[1];
                double l = sq[2];

                if (mid <= y) {
                    continue;
                } else if (mid >= y + l) {
                    below += l * l;
                } else {
                    below += (mid - y) * l;
                }
            }

            if (below * 2 >= totalArea)
                high = mid;
            else
                low = mid;
        }

        return low;
    }
};
