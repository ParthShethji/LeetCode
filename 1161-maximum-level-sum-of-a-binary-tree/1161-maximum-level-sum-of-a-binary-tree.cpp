#include <queue>
using namespace std;

class Solution {
public:
    void helper(queue<TreeNode*>& q, int& mx, int &ans) {
        int level =0;
        while(!q.empty()){
            int n = q.size();
            int currSum = 0;
            level+=1;
            for (int i = 0; i < n; i++) {
                TreeNode* curr = q.front();
                q.pop();

                currSum += curr->val;

                if (curr->left) q.push(curr->left);
                if (curr->right) q.push(curr->right);
            }

            if(currSum>mx){
                ans = level;
                mx = currSum;
            }
        }
    }
    int maxLevelSum(TreeNode* root) {
        if (!root) return 0;
        int ans =1;

        queue<TreeNode*> q;
        int mx = root->val;

        q.push(root);
        helper(q, mx, ans);

        return ans;
    }
};
