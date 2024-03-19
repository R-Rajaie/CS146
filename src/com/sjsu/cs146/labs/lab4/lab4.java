package com.sjsu.cs146.labs.lab4;

public class lab4 {
    public static void main(String[] args) {
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);
        TreeNode two = new TreeNode(2, three, four);
        TreeNode eight = new TreeNode(8, five, six);
        TreeNode one = new TreeNode(1, two, eight);
        System.out.println(one.left + " " + one.right);
        invertTree(one);
        System.out.println(one.left + " " + one.right);
    }
    public static TreeNode invertTree(TreeNode root) {
        // just to cover our asses in case we get a bad node
        if(root == null) return null;

        // if both children aren't present we are dealing with a special case and must deal with it accordingly
        if(root.right == null || root.left == null){
            // if you only have a left node,
            // you have to swap the left node to right without trying to call a nonexistent right node
            // we then call the method on the right node to continue the process
            if(root.right == null){
                root.right = root.left;
                root.left = null;
                invertTree(root.right);
            }
            // same concept but with the other node
            else if(root.left == null){
                root.left = root.right;
                root.right = null;
                invertTree(root.left);
            }
            // if neither left nor right child exist, we assume we've reached the end of the tree and just return the root
            else return root;
        }
        // this is our 'normal' case. if both nodes exist,
        // we swap them and call invertTree on each node to continue swapping their children
        else{
            TreeNode temp = root.right;
            root.right = root.left;
            root.left = temp;
            invertTree(root.left);
            invertTree(root.right);
        }
        return root;
    }
}
