class Solution {
    public List<TreeNode> generateTrees(int n) {
        if (n == 0) return new ArrayList<>();
        return buildTrees(1, n);
    }

    private List<TreeNode> buildTrees(int left, int right) {
        List<TreeNode> result = new ArrayList<>();

        if (left>right) {
            result.add(null);
            return result;
        }

        for (int i = left; i <= right; i++) {
            List<TreeNode> leftTrees=buildTrees(left,i-1);
            List<TreeNode> rightTrees=buildTrees(i+1,right);

            for (TreeNode l:leftTrees) {
                for (TreeNode r:rightTrees) {
                    TreeNode root = new TreeNode(i);
                    root.left=l;
                    root.right=r;
                    result.add(root);
                }
            }
        }

        return result;
    }
}
