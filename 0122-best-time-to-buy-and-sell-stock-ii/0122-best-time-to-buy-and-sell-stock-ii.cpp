class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int profit = 0;
        int minprice = INT_MAX;
        for(int i: prices){
            int curr = i-minprice;
            if(curr>0){
                profit+=curr;
                minprice = i;
            }
            else{
                minprice = min(i, minprice);
            }
        }
        return profit;
    }
};