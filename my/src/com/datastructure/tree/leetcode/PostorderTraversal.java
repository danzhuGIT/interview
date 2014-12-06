package com.datastructure.tree.leetcode;

import com.datastructure.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by danzhu on 10/29/14.
 *
 * Given a binary tree, return the postorder traversal of its nodes' values.

 For example:
 Given binary tree {1,#,2,3},
 1
 \
 2
 /
 3
 return [3,2,1].

 Note: Recursive solution is trivial, could you do it iteratively?

 */
public class PostorderTraversal {
    public static void main(String[] args){
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        three.right = one;
        one.left = two;

        //System.out.print(postorderTraversal(three));
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();

        TreeNode pre = null;
        TreeNode cur = root;

        // pre node used to record if mid node's child has been visited inorder to tell if need to pop out
        //the mid node
        while(cur!=null){
            stack.push(cur);
            cur = cur.left;
        }
        while(!stack.isEmpty()){
            cur = stack.peek();
            if(cur.right==null || pre == cur.right){
                result.add(cur.val);
                pre = stack.pop();
            }else{
                cur = cur.right;
                while(cur!=null){
                    stack.push(cur);
                    cur = cur.left;
                }
            }
        }

        return result;
    }
}
