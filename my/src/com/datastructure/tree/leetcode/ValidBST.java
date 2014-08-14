package com.datastructure.tree.leetcode;

import com.datastructure.tree.TreeNode;

/**
 * Created by danzhu on 7/4/14.
 *
 * Given a binary tree, determine if it is a valid binary search tree (BST).

 * Assume a BST is defined as follows:

 * The left subtree of a node contains only nodes with keys less than the node's key.
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 */

public class ValidBST {
    public boolean isValidBST(TreeNode root) {
        return recursion(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public boolean recursion(TreeNode root, int min, int max){
        if (root == null) return true;

        if(root.val > min && root.val < max){
            return recursion(root.left, min, root.val) && recursion(root.right, root.val, max);
        } else return false;
    }
}
