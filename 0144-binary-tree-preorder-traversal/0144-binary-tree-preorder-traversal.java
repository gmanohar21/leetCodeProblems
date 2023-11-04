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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> pl=new ArrayList<>();
        if(root == null) return pl;
        Stack<TreeNode> pos=new Stack<>();
        pos.push(root);
        while(!pos.isEmpty()){
            TreeNode temp=pos.pop();
            pl.add(temp.val);
            if(temp.right!=null) pos.push(temp.right);
            if(temp.left!=null) pos.push(temp.left);
        } 
        return pl;
     }
}