class Solution {
    private int maxSum;

    public int maxPathSum(TreeNode root) {
        maxSum=Integer.MIN_VALUE;
        dfs(root);
        return maxSum;
    }

    private int dfs(TreeNode node) {
        if (node==null) return 0;
        int left=Math.max(dfs(node.left),0);
        int right=Math.max(dfs(node.right),0);

        int curr=node.val+left+right;
        maxSum = Math.max(maxSum,curr);
        return node.val+Math.max(left,right);
    }
}
