class Solution {
public:
    int ans = 0;

    void helper(TreeNode* root, string s) {

        if (root == nullptr)
            return;

        // append current node value (0 or 1)
        s.push_back(root->val + '0');

        // if leaf node
        if (root->left == nullptr && root->right == nullptr) {
            int temp = stoi(s, nullptr, 2);
            ans += temp;
            return;
        }

        helper(root->left, s);
        helper(root->right, s);
    }

    int sumRootToLeaf(TreeNode* root) {

        string s;

        helper(root, s);

        return ans;
    }
};