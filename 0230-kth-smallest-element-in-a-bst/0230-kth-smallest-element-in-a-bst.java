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
    public  ArrayList<Integer> inorder(TreeNode node, ArrayList<Integer> res){
        if(node==null)  return res;
        inorder(node.left, res);
        res.add(node.val);
        inorder(node.right, res);
        return res;
    }

    public int kthSmallest(TreeNode root, int k) {
        
        ArrayList<Integer> res = inorder(root, new ArrayList<>());
        return res.get(k-1);
    }
}