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
    int postIndex;
    int[] postorder;

    private TreeNode helper(int inLeft, int inRight) {

        // no elements left
        if (inLeft > inRight) {
            return null;
        }

        // current root from postorder
        int rootVal = postorder[postIndex--];
        TreeNode root = new TreeNode(rootVal);

        // find root in inorder
        int mid = map.get(rootVal);

        // IMPORTANT:
        // build right first
        root.right = helper(mid + 1, inRight);

        // then left
        root.left = helper(inLeft, mid - 1);

        return root;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {

        this.postorder = postorder;
        this.postIndex = postorder.length - 1;

        // store inorder indexes
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return helper(0, inorder.length - 1);
    }
}