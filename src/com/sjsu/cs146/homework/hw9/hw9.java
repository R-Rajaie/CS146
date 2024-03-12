package com.sjsu.cs146.homework.hw9;

public class hw9 {
    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(5);
        TreeNode c = new TreeNode(9);
        TreeNode d = new TreeNode(3, a, null);
        TreeNode e = new TreeNode(8, b, c);
        TreeNode f = new TreeNode(4, d, e);
        System.out.println(lowestCommonAncestor(f, a, d).val);
        System.out.println(lowestCommonAncestor(f, a, b).val);
    }
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val < root.val  && q.val < root.val) return lowestCommonAncestor(root.left, p, q);
        if (p.val > root.val && q.val > root.val) return lowestCommonAncestor(root.right, p, q);
        return root;
    }
}