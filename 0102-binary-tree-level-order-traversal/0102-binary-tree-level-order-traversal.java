// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
// class Solution {
//     public List<List<Integer>> levelOrder(TreeNode root) {
//         Queue<TreeNode> q = new LinkedList<>();
//         List<List<Integer>> finalAns = new ArrayList<List<Integer>>();
//         if(root==null){
//             return finalAns;
//         }
//         q.add(root);
//         while(!q.isEmpty()){
//             int levels = q.size();
//             List<Integer> subLevels = new ArrayList<>();
//             for(int i=0;i<levels;i++){
//                 if(q.peek().left!=null){
//                     q.add(q.peek().left);
//                 }
//                 if(q.peek().right!=null){
//                     q.add(q.peek().right);
//                 }
//                 subLevels.add(q.remove().val);
//             }
//             finalAns.add(subLevels);
//         }
//         return finalAns;
//     }
// }

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        levelOrderHelper(root, result, 0);
        return result;
    }

    public void levelOrderHelper(TreeNode root, List<List<Integer>> list, int level) {
        if(root == null) {
            return;
        }
        if(level >= list.size()) {
            list.add(new LinkedList<Integer>());
        }
        list.get(level).add(root.val);
        levelOrderHelper(root.left, list, level+1);
        levelOrderHelper(root.right, list, level+1);
    }
}