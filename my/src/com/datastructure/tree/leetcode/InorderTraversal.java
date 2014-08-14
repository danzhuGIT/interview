package com.datastructure.tree.leetcode;

import com.datastructure.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by danzhu on 7/5/14.
 *
 * Given a binary tree, return the inorder traversal of its nodes' values.

 For example:
 Given binary tree {1,#,2,3},
 1
 \
 2
 /
 3
 return [1,3,2].

 Note: Recursive solution is trivial, could you do it iteratively?

 */
public class InorderTraversal {
    //iteration
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode current = root;
        while(!stack.empty()||current!=null){
            if(current!=null){
                stack.add(current);
                current=current.left;
            } else {
                current = stack.pop();
                result.add(current.val);
                current=current.right;
            }
        }
        return result;
    }
}
