class Solution {
public:
    int minimumBoxes(vector<int>& apple, vector<int>& capacity) {
        int total_apples = 0;
        for (int a : apple) total_apples += a;

        // Pick largest boxes first
        sort(capacity.begin(), capacity.end(), greater<int>());

        int curr_capacity = 0;
        int boxes = 0;

        for (int cap : capacity) {
            curr_capacity += cap;
            boxes++;
            if (curr_capacity >= total_apples) break;
        }

        return boxes;
    }
};
