class Solution {
public:
    void helper(TreeNode* root,
                map<int, map<int, vector<int>>>& mp,
                int row,
                int col) {

        if (root == nullptr) return;

        mp[col][row].push_back(root->val);

        helper(root->left, mp, row + 1, col - 1);
        helper(root->right, mp, row + 1, col + 1);
    }

    vector<vector<int>> verticalTraversal(TreeNode* root) {
        map<int, map<int, vector<int>>> mp;
        helper(root, mp, 0, 0);

        vector<vector<int>> ans;

        for (auto& colPair : mp) {
            vector<int> column;

            for (auto& rowPair : colPair.second) {
                sort(rowPair.second.begin(), rowPair.second.end());
                column.insert(column.end(),
                              rowPair.second.begin(),
                              rowPair.second.end());
            }

            ans.push_back(column);
        }

        return ans;
    }
};
