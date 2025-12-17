class Solution {
public:
    long long maximumProfit(vector<int>& prices, int k) {
            const long long NEG_INF = -1e18;
vector<long long> flat(k+1, NEG_INF),
                      lon(k+1, NEG_INF),
                      sho(k+1, NEG_INF);

    flat[0] = 0;
    for (int price : prices) {
        vector<long long> newFlat = flat;
        vector<long long> newLong = lon;
        vector<long long> newShort = sho;

         for (int t = 0; t <= k; t++) {
             if (flat[t] != NEG_INF) {
                newLong[t]  = max(newLong[t],  flat[t] - price);
                newShort[t] = max(newShort[t], flat[t] + price);
            }

            if (t + 1 <= k) {
                if (lon[t] != NEG_INF)
                    newFlat[t + 1] = max(newFlat[t + 1], lon[t] + price);
                if (sho[t] != NEG_INF)
                    newFlat[t + 1] = max(newFlat[t + 1], sho[t] - price);
            }
        }
                flat = newFlat;
        lon  = newLong;
        sho  = newShort;
    }
        long long ans = 0;
    for (int t = 0; t <= k; t++) ans = max(ans, flat[t]);
    return ans;

};
};