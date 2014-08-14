package com.datastructure.tree.cracking;

/**
 * Created by danzhu on 8/3/14.
 *
 * Design an algorithm and write code to find the first common ancestor of two nodes in a binary tree.
 * Avoid storing additional nodes in a data structure. NOTE: This is not necessarily a binary search tree.
 *
 */
public class FirstCommonAncestor {
    public static void main(String[] args){
        TreeNode four  = new TreeNode(4);
        TreeNode three  = new TreeNode(3);
        TreeNode two  = new TreeNode(2);
        TreeNode one  = new TreeNode(1);
        TreeNode five  = new TreeNode(5);
        TreeNode six  = new TreeNode(6);

        four.left = two;
        four.right = six;
        six.left = five;
        two.right = three;
        two.left = one;
        System.out.print(firstCommonAncestor(four, one, three).val);


    }
    public static TreeNode firstCommonAncestor(TreeNode root, TreeNode n1, TreeNode n2){
        if(root == n1 || root == n2)
            return root;

        if(coverNode(root.left, n1) && coverNode(root.left, n2))
            return firstCommonAncestor(root.left, n1, n2);

        if(coverNode(root.right, n1) && coverNode(root.right, n2))
            return firstCommonAncestor(root.right, n1, n2);

        return root;
    }

    public static boolean coverNode(TreeNode root, TreeNode node){
        if(root == node)
            return true;
        if(root == null)
            return false;
        return coverNode(root.left, node) || coverNode(root.right, node);
    }
}
