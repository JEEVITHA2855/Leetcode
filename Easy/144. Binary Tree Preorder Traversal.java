class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preorder = new ArrayList<>();
        if(root == null) return preorder; 
        preorder.add(root.val);  
        preorder.addAll(preorderTraversal(root.left)); 
        preorder.addAll(preorderTraversal(root.right));
        return preorder;
    }
}
