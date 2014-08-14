package com.datastructure.tree.leetcode;

import com.datastructure.tree.TreeNode;

import java.util.Stack;

/**
 * Created by danzhu on 7/23/14.
 * Given a binary tree, flatten it to a linked list in-place.

 For example,
 Given

 1
 / \
 2   5
 / \   \
 3   4   6
 The flattened tree should look like:
 1
 \
 2
 \
 3
 \
 4
 \
 5
 \
 6
 */
public class FlattenBT {
    public void flatten(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();

        TreeNode cur = root;
        while(cur!=null){
            if(cur.right!=null)
                stack.push(cur.right);

            if(cur.left!=null){
                cur.right = cur.left;
                cur.left = null;
            } else if(!stack.isEmpty()){
                cur.right = stack.pop();
            }
            cur = cur.right;
        }
    }
}
