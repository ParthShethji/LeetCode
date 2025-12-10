#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    static const long long MOD = 1000000007;

    long long factorialMod(int n) {
        long long res = 1;
        for (int i = 2; i <= n; ++i) {
            res = (res * i) % MOD;
        }
        return res;
    }

    long long countPermutations(const vector<int>& complexity) {
        if (complexity.empty()) return 0;

        int first = complexity[0];
        int count = 0;

        for (size_t i = 1; i < complexity.size(); ++i) {
            if (complexity[i] == first) return 0;      // equal → answer = 0
            if (complexity[i] > first) count++;        // strictly greater → count
        }

        if (count != 0 and count==complexity.size()-1) return factorialMod(count);
        return 0;
    }
};
