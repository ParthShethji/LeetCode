class Solution {
public:
    int jump(vector<int>& nums) {
        int n = nums.size();
        int jumps = 0;
        int currentEnd = 0;   // end of current jump range
        int farthest = 0;     // farthest we can reach in next jump

        for (int i = 0; i < n - 1; i++) {   // no need to process last index
            farthest = max(farthest, i + nums[i]);

            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;

                if (currentEnd >= n - 1) break;
            }
        }

        return jumps;
    }
};
