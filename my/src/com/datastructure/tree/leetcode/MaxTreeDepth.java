package com.datastructure.tree.leetcode;

import com.datastructure.tree.TreeNode;

/**
 * Created by danzhu on 7/1/14.
 */
public class MaxTreeDepth {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;

        if(root.left ==  null) return maxDepth(root.right) + 1;
        if(root.right == null) return maxDepth(root.left) + 1;

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
