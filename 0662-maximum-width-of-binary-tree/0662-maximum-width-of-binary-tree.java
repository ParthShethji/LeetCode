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

// class Pair{
//     TreeNode node;
//     int num;
//     Pair(TreeNode _node, int _num){
//         num=_num;
//         node = _node;
//     }
// }
// class Solution {
//     public int widthOfBinaryTree(TreeNode root) {
//         if(root==null)  return 0;
//         int ans =0;
//         Queue<Pair> q = new LinkedList<Pair>();
//         q.offer(new Pair(root, 0));
//         while(!q.isEmpty()){
//             int size = q.size();
//             int min = q.peek().num;
//             int first =0; int last=0;
//             for(int i=0; i<size; i++){
//                 int cur_id = q.peek().num-min;
//                 TreeNode node = q.peek().node;
//                 q.poll();
//                 if(i==0)    first = cur_id;
//                 if(i==size-1)   last = cur_id;
//                 if(node.left != null){
//                     q.offer(new Pair(node.left, (2*cur_id+1)));
//                 }
//                 if(node.right != null){
//                     q.offer(new Pair(node.right, (2*cur_id+2)));
//                 }
//             }
//             ans = Math.max(ans, last-first+1);
//         }
//         return ans;
//     }
// }


class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) {
           return 0;
       }
        return dfs(root, 0, 1, new ArrayList<Integer>());
    }
    private int dfs(TreeNode root, int depth, int index, List<Integer> list) {
        if(root == null) {
            return 0;
        }
        if(depth == list.size()) {
            list.add(index);
        }
        int currWidth = index - list.get(depth) + 1;
        int left = dfs(root.left, depth + 1, index*2, list);
        int right = dfs(root.right, depth+1, index*2 + 1, list);
        return Math.max(currWidth, Math.max(left, right));
    }
}