class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return root;
        if(key<root.val){
            root.left =  deleteNode(root.left,key);
        }
        else if(key>root.val){
            root.right = deleteNode(root.right,key);
        }
        else{
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            else{
                root.val = minval(root.right);
                root.right = deleteNode(root.right,root.val);
            }
        }
        return root;
    }

    public int minval(TreeNode node){
        int min = node.val;
        while(node.left!=null){
            node=node.left;
            min=node.val;
        }
        return min;
    }
}
