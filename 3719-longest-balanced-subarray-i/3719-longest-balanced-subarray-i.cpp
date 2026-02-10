class Solution {
public:
    int longestBalanced(vector<int>& nums) {
        int maxlen = 0;
        int n = nums.size();

        for (int i = 0; i < n; i++) {

            unordered_map<int, int> freq;
            int diffeven = 0;
            int diffodd = 0;

            for (int j = i; j < n; j++) {

                freq[nums[j]]++;

                // Only count when first seen
                if (freq[nums[j]] == 1) {
                    if (nums[j] % 2 == 0)
                        diffeven++;
                    else
                        diffodd++;
                }

                if (diffeven == diffodd) {
                    maxlen = max(maxlen, j - i + 1);
                }
            }
        }

        return maxlen;
    }
};
