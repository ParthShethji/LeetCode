class Solution {
private:

    // Inorder traversal: store values
    void inorder(TreeNode* root, vector<int>& res) {
        if (root == nullptr) return;

        inorder(root->left, res);
        res.push_back(root->val);
        inorder(root->right, res);
    }

    // Build balanced BST from sorted array
    TreeNode* build_bst(vector<int>& res, int left, int right) {
        if (left > right) return nullptr;

        int mid = left + (right - left) / 2;

        TreeNode* root = new TreeNode(res[mid]);

        root->left = build_bst(res, left, mid - 1);
        root->right = build_bst(res, mid + 1, right);

        return root;
    }

public:
    TreeNode* balanceBST(TreeNode* root) {

        vector<int> inorder_res;

        // Step 1: Get sorted values
        inorder(root, inorder_res);

        int n = inorder_res.size();

        // Step 2: Build balanced BST
        return build_bst(inorder_res, 0, n - 1);
    }
};
