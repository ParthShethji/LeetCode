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
    private boolean helper(TreeNode p, TreeNode q){
               if(p==null && q == null){
            return true;
        }
        else if(p==null || q==null){
            return false;
        }
        boolean left = p.val == q.val;
        boolean right = p.val == q.val;
        boolean leftTree = helper(p.left, q.left);
        boolean rightTree = helper(p.right, q.right);
        return (left && right && leftTree && rightTree);    
    }
  
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return helper(p,q);
    }
}