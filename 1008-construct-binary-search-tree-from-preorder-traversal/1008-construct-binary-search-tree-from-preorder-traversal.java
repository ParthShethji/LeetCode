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
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = null;
        for(int i: preorder){
            root = insert(root, i);
        }
        return root;
    }
    
    public static TreeNode insert(TreeNode root, int val){
        if(root == null)    return new TreeNode(val);
        else if(val<root.val)  root.left= insert(root.left, val);
        else if(val>root.val) root.right= insert(root.right, val);
        return root;
    }
}