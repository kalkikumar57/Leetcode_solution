class Solution {

     public boolean isBalanced(TreeNode root) {
        return Height (root) != -1;
}
    int Height(TreeNode root){
        if(root == null) return 0;
        
        int leftheight = Height(root.left);
        if(leftheight == -1) return -1;
        int rightheight = Height(root.right);
        if(rightheight == -1) return -1;
        
        if(Math.abs(leftheight - rightheight) > 1) return -1;
        return Math.max(leftheight,rightheight)+1;
    }
}

