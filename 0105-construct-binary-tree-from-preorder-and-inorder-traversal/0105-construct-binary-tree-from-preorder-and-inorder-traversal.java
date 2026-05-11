/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {

    HashMap<Integer, Integer> map = new HashMap<>();
    int preIndex = 0;
    int[] preorder;

    private TreeNode helper(int inLeft, int inRight) {

        // no nodes in this subtree
        if (inLeft > inRight) {
            return null;
        }

        // current root from preorder
        int rootVal = preorder[preIndex++];
        TreeNode root = new TreeNode(rootVal);

        // find root in inorder
        int mid = map.get(rootVal);

        // build left subtree
        root.left = helper(inLeft, mid - 1);

        // build right subtree
        root.right = helper(mid + 1, inRight);

        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        this.preorder = preorder;

        // store inorder indexes
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return helper(0, inorder.length - 1);
    }
}