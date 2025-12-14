class Solution {
public:
    int numberOfWays(string corridor) {
        const int MOD = 1000000007;

        long long ans = 1;
        int seats = 0;
        int plants = 0;

        // count total seats first
        for (char c : corridor) {
            if (c == 'S') seats++;
        }

        // invalid cases
        if (seats == 0 || seats % 2 != 0) return 0;

        seats = 0;

        for (char c : corridor) {
            if (c == 'S') {
                seats++;

                // when a pair completes (except first pair)
                if (seats > 2 && seats % 2 == 0) {
                    ans = (ans * (plants + 1)) % MOD;
                    plants = 0;
                }
            } else if (seats >= 2 && seats % 2 == 0) {
                // count plants only between seat pairs
                plants++;
            }
        }

        return (int)ans;
    }
};
