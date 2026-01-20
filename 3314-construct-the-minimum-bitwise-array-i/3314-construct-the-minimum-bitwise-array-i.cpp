class Solution {
public:
    vector<int> minBitwiseArray(vector<int>& nums) {
        vector<int> ans;

        for (int x : nums) {
            if (x == 2) {
                ans.push_back(-1);
                continue;
            }

            int k = 0;
            int temp = x;

            // count trailing 1s
            while (temp & 1) {
                k++;
                temp >>= 1;
            }

            ans.push_back(x - (1 << (k - 1)));
        }

        return ans;
}

};