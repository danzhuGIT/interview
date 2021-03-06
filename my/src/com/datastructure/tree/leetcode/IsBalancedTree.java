package com.datastructure.tree.leetcode;

import com.datastructure.tree.TreeNode;

/**
 * Created by danzhu on 6/30/14.
 * Given a binary tree, determine if it is height-balanced.

 * For this problem, a height-balanced binary tree is defined
 * as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 */

public class IsBalancedTree {
    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;

        if (getHeight(root) == -1)
            return false;

        return true;
    }

    public int getHeight(TreeNode root){
        if(root == null) return 0;

        int left = getHeight(root.left);
        int right = getHeight(root.right);

        if(left == -1 || right == -1 || Math.abs(left-right) > 1)
            return -1;

        return Math.max(left,right)+1;
    }
}

