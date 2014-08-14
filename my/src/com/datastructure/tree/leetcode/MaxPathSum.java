package com.datastructure.tree.leetcode;

import com.datastructure.tree.TreeNode;

/**
 * Created by danzhu on 7/23/14.
 * Given a binary tree, find the maximum path sum.

 The path may start and end at any node in the tree.

 For example:
 Given the below binary tree,

 1
 / \
 2   3
 Return 6.
 */
public class MaxPathSum {
    int max = 0;

    public int maxPathSum(TreeNode root) {
        if(root == null)
            return 0;
        else
            max = root.val;

        findMax(root);
        return max;
    }

    public int findMax(TreeNode root){
        if(root == null)
            return 0;

        int left = Math.max(findMax(root.left), 0);
        int right = Math.max(findMax(root.right), 0);

        max = Math.max(root.val + left + right, max);
        return root.val + Math.max(left, right);
    }
}
