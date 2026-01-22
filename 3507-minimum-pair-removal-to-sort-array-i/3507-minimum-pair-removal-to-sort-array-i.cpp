class Solution {
public:
    int minimumPairRemoval(vector<int>& nums) {
        int ops = 0;

        auto isSorted = [&]() {
            for (int i = 1; i < nums.size(); i++) {
                if (nums[i] < nums[i - 1])
                    return false;
            }
            return true;
        };

        while (!isSorted()) {
            int minSum = INT_MAX;
            int idx = -1;

            // Find leftmost minimum-sum pair
            for (int i = 0; i < nums.size() - 1; i++) {
                int s = nums[i] + nums[i + 1];
                if (s < minSum) {
                    minSum = s;
                    idx = i;
                }
            }

            // Merge
            nums[idx] = minSum;
            nums.erase(nums.begin() + idx + 1);

            ops++;
        }

        return ops;
    }
};
