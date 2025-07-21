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
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return sym(root.right,root.left);
    }
    public boolean sym(TreeNode right,TreeNode left){
        if (right==null && left==null ) return true;
          if (right==null || left==null ) return false;
          return (left.val==right.val)
           && sym(right.right,left.left)
           && sym (left.right,right.left);
    }
}
