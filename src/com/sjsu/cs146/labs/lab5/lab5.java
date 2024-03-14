package com.sjsu.cs146.labs.lab5;

import java.util.ArrayList;

public class lab5 {
    public static void main(String[] args) {
        TreeNode one = new TreeNode(1);
        TreeNode three = new TreeNode(3);
        TreeNode eight = new TreeNode(8);
        TreeNode five = new TreeNode(5);
        TreeNode two = new TreeNode(2, one, three);
        TreeNode six = new TreeNode(6, five, eight);
        TreeNode four = new TreeNode(4, two, six);

        System.out.println(isValidBST(four));
    }
    public static boolean isValidBST(TreeNode root) {
        return helper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static boolean helper(TreeNode root, int min, int max){
        if (root == null) return true;
        if (root.val < min || root.val > max) return false;
        return helper(root.left, min, root.val - 1) && helper(root.right, root.val + 1, max);
    }
}
