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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> rl=new ArrayList<>();
       
        Queue<TreeNode> ql=new LinkedList<>();
        if(root==null) return rl;
        ql.offer(root);
        while(!ql.isEmpty()){
            int no=ql.size();
             List<Integer> rlin=new ArrayList<>();
            for(int i=0;i<no;i++){
                if(ql.peek().left !=null)
                ql.offer(ql.peek().left);
               if(ql.peek().right!=null)
                ql.offer(ql.peek().right);
            
               rlin.add(ql.poll().val);
            }
             rl.add(rlin);
        }
       
        return rl;
    }
}