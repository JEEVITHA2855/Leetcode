class Solution {
    public void recoverTree(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode x=null, y=null, prev=null;
        TreeNode curr = root;

        while (curr!=null ||!stack.isEmpty()) {
            while (curr!=null) {
                stack.push(curr);
                curr=curr.left;
            }

            curr=stack.pop();
            if (prev!=null &&prev.val > curr.val) {
                if (x == null) {
                    x = prev; 
                }
                y = curr; 
            }

            prev = curr;
            curr = curr.right;
        }
        if (x != null && y != null) {
            int temp = x.val;
            x.val = y.val;
            y.val = temp;
        }
    }
}
