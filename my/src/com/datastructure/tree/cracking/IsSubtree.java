package com.datastructure.tree.cracking;

/**
 * Created by danzhu on 8/3/14.
 * You have two very large binary trees:
 * T1, with millions of nodes, and T2, with hundreds of nodes. Create an algorithm to decide if T2 is a subtree of T1.
 */
public class IsSubtree {
    public static void main(String[] args){
        TreeNode four  = new TreeNode(4);
        TreeNode three  = new TreeNode(3);
        TreeNode two  = new TreeNode(2);
        TreeNode one  = new TreeNode(1);
        TreeNode five  = new TreeNode(5);
        TreeNode six  = new TreeNode(6);

        four.left = two;
        two.parent = four;
        four.right = six;
        six.parent = four;
        six.left = five;
        five.parent = six;
        two.right = three;
        three.parent = two;
        two.left = one;
        one.parent = two;

        TreeNode seven = new TreeNode(7);
        System.out.print(containsTree(four, seven));


    }
    public static boolean containsTree(TreeNode root, TreeNode node){
        if(node == null)
            return true;

        return subtree(root, node);
    }

    public static boolean subtree(TreeNode root, TreeNode node){
        if(root == null)
            return false;
        if(root.val == node.val){
            return match(root, node);
        }

        return subtree(root.left, node) || subtree(root.right, node);
    }

    public static boolean match(TreeNode root, TreeNode node){
        if(root == null && node == null)
            return true;
        if(root == null || node == null)
            return false;
        if(root.val != node.val)
            return false;
        return match(root.left, node.left) && match(root.right, node.right);
    }
}
