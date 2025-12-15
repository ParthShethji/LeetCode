class Solution {
public:
    long long getDescentPeriods(vector<int>& prices) {
        long long ans = 0;
        int curr = 0;
        for(int i =1; i<prices.size(); i++){
            if(prices[i-1]-prices[i]==1){
                curr++;
            }
            else{
                if(curr!=0){
ans += (long long)curr * (curr + 1) / 2;

                }
                curr=0;
            }
        }
            if(curr!=0){
ans += (long long)curr * (curr + 1) / 2;
            }
        return ans + prices.size();
    }
};