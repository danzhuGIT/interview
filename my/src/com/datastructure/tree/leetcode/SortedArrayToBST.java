package com.datastructure.tree.leetcode;

import com.datastructure.tree.TreeNode;

/**
 * Created by danzhu on 7/10/14.
 *
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 */
public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] num) {
        if( num == null || num.length == 0) return null;

        return recursion(num, 0, num.length-1);
    }

    private TreeNode recursion(int[] num, int start, int end){
        if(start > end)
            return null;

        int mid = (start+end)/2;
        TreeNode root = new TreeNode(num[mid]);
        root.left = recursion(num, start, mid-1);
        root.right = recursion(num, mid+1, end);
        return root;
    }
}
