class Solution {
public:
    void helper(TreeNode* root, vector<int>& ans) {
        if (root == nullptr) return;

        TreeNode* left = root->left;
        TreeNode* right = root->right;

        helper(left, ans);
        ans.push_back(root->val);
        helper(right, ans);
    }

    vector<int> inorderTraversal(TreeNode* root) {
        vector<int> ans;
        helper(root, ans);
        return ans;
    }
};
