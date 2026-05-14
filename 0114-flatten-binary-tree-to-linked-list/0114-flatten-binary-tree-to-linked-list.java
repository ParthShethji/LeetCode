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
    private void helper(TreeNode root){
        if(root==null)  return;
        helper(root.left);
        helper(root.right);
        TreeNode left = root.left;
        TreeNode right = root.right;
        TreeNode curr = root;
        root.left = null;
        root.right = left;
        while(curr.right != null){
            curr = curr.right;
        }

        curr.right = right;
           
    }
    public void flatten(TreeNode root) {
        helper(root);
    }
}