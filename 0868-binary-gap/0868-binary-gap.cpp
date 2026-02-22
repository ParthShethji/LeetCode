class Solution {
public:
    int binaryGap(int n) {
        int max_dist = 0;
        int prev_1 = -1;
        int ptr = 0;

        while (n > 0) {

            if ((n & 1) == 1) {

                if (prev_1 != -1) {
                    max_dist = max(max_dist, ptr - prev_1);
                }

                prev_1 = ptr;
            }

            n >>= 1;
            ptr++;
        }

        return max_dist;
    }
};