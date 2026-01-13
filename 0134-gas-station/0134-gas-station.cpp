class Solution {
public:
    int canCompleteCircuit(vector<int>& gas, vector<int>& cost) {
        int n = gas.size();
        int total = 0;   // total gas balance
        int tank = 0;    // current tank
        int start = 0;   // candidate starting index

        for (int i = 0; i < n; i++) {
            int diff = gas[i] - cost[i];
            total += diff;
            tank += diff;

            if (tank < 0) {
                // cannot start from current start
                start = i + 1;
                tank = 0;
            }
        }

        return (total >= 0) ? start : -1;
    }
};
