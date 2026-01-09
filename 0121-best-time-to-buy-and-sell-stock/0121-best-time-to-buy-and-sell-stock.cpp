class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int minPrice = INT_MAX;
        int profit = 0;
        for(int i: prices){
            profit = max(profit, (i-minPrice));
            minPrice = min(i, minPrice);
        }
        return profit;
    }
};