package com.datastructure.tree.leetcode;

import com.datastructure.tree.TreeNode;

/**
 * Created by danzhu on 6/30/14.
 */
public class MinTreeDepth {
    public static void main(String[] args){
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        one.left = two;
        System.out.print(minDepth(one));
    }

    public static int minDepth(TreeNode root){
        if (root == null)
            return 0;

        if(root.left == null) return minDepth(root.right)+1;
        if(root.right == null) return minDepth(root.left)+1;

        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}
