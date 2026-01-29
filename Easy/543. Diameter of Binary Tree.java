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
     public int f(TreeNode root,int[] max){
        if (root==null) return 0;
        int lh=f(root.left,max);
        int rh=f(root.right,max);
        int d=lh+rh;
          max[0] = Math.max(max[0], d);
        return 1+Math.max(lh,rh);
    }
    public int diameterOfBinaryTree(TreeNode root){
        int[] max=new int[1];
        f(root,max);
        return max[0];
    }
}
