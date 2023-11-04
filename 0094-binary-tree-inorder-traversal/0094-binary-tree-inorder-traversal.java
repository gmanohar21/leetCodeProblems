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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> li=new ArrayList<>();
        create(root,li);
        return li;
    }
    public List<Integer> create(TreeNode root,List<Integer> li){
          if(root==null) return li;
          if(root.left!=null) create(root.left,li);
          li.add(root.val);
          if(root.right!=null) create(root.right,li);
          return li;
    }
}