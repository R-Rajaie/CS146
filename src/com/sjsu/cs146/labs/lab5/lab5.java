package com.sjsu.cs146.labs.lab5;

public class lab5 {
    public static void main(String[] args) {

    }
    public boolean isValidBST(TreeNode root) {
        if(root.left == null || root.right == null){
            if(root.left != null){
                isValidBST(root.left);
                return root.left.val < root.val;
            }
            else if (root.right != null){
                isValidBST(root.right);
                return root.right.val > root.val;
            }
            return true;
        }
        return root.left.val < root.val && root.right.val > root.val;
    }
}
