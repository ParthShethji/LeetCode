#include <queue>
#include <algorithm>
using namespace std;

class Solution {
public:
    int widthOfBinaryTree(TreeNode* root) {
        if (!root) return 0;

        long long ans = 0;
        queue<pair<TreeNode*, long long>> q;
        q.push({root, 0});

        while (!q.empty()) {
            int size = q.size();
            long long base = q.front().second;  // normalization
            long long first = 0, last = 0;

            for (int i = 0; i < size; i++) {
                auto curr = q.front();
                q.pop();

                TreeNode* node = curr.first;
                long long idx = curr.second - base;

                if (i == 0) first = idx;
                if (i == size - 1) last = idx;

                if (node->left)
                    q.push({node->left, 2 * idx});
                if (node->right)
                    q.push({node->right, 2 * idx + 1});
            }

            ans = max(ans, last - first + 1);
        }

        return (int)ans;
    }
};
