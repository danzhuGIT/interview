package com.datastructure.tree.leetcode;

import com.datastructure.tree.cracking.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by danzhu on 7/5/14.
 *
 * Given a binary tree, return the preorder traversal of its nodes' values.

 For example:
 Given binary tree {1,#,2,3},
 1
 \
 2
 /
 3
 return [1,2,3].

 Note: Recursive solution is trivial, could you do it iteratively?
 *
 */
public class PreorderTraversal {
    //iteration
    public List<Integer> preorderTraversal(TreeNode root) {

        ArrayList<Integer> result = new ArrayList<Integer>();

        if(root == null) return result;

        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);

        while(!stack.empty()){
            TreeNode current = stack.pop();
            result.add(current.val);
            if(current.right!=null) stack.push(current.right);
            if(current.left!=null) stack.push(current.left);
        }
        return result;
    }

    //recursion
    void preOrder (TreeNode root)
    {
        if(root == null) return;

        System.out.print(root.val);

        preOrder( root.left );
        preOrder( root.right );
    }
}
