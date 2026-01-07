class Solution {
public:
    long long ans = 1;
    int modulo = 1000000007;

    int helper(TreeNode* root, int& TotalSum) {
        if (root == nullptr) return 0;

        int currSum = root->val;
        int leftSum = helper(root->left, TotalSum);
        int rightSum = helper(root->right, TotalSum);

        ans = max(ans, 1LL * (TotalSum - leftSum) * leftSum);
        ans = max(ans, 1LL * (TotalSum - rightSum) * rightSum);

        return currSum + leftSum + rightSum;
    }

    int sum(TreeNode* root) {
        if (root == nullptr) return 0;

        int currSum = root->val;
        int leftSum = sum(root->left);
        int rightSum = sum(root->right);

        return currSum + leftSum + rightSum;
    }

    int maxProduct(TreeNode* root) {
        int total = sum(root);
        helper(root, total);
        return ans % modulo;
    }
};
