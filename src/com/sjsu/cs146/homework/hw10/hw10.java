package com.sjsu.cs146.homework.hw10;

import java.util.*;

public class hw10 {
    public static void main(String[] args) {
        TreeNode one = new TreeNode(1);
        TreeNode five = new TreeNode(5);
        TreeNode nine = new TreeNode(9);
        TreeNode three = new TreeNode(3, one, null);
        TreeNode eight = new TreeNode(8, five, nine);
        TreeNode four = new TreeNode(4, three, eight);
        System.out.println(levelOrder(four));
    }
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> total = new ArrayList<>();
        if(root == null) return total;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

       while(!queue.isEmpty()){
           ArrayList<Integer> level = new ArrayList<>();
           int size = queue.size();

           for(int i = 0; i < size; i++){
               TreeNode node = queue.poll();
               level.add(node.val);

               if(node.left != null) queue.offer(node.left);
               if(node.right != null) queue.offer(node.right);
           }
           total.add(level);
       }
       return total;
    }
}
