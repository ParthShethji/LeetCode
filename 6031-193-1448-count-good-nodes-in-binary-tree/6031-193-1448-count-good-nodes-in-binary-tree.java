class Solution {
    public int goodNodes(TreeNode root) {
        return helper(root, Integer.MIN_VALUE);
    }

    private int helper(TreeNode root, int max) {
        if (root == null) return 0;

        int count = 0;
        if (root.val >= max) {
            count = 1;
            max = root.val;
        }

        return count + helper(root.left, max) + helper(root.right, max);
    }
}
