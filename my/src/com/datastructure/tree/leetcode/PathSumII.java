package com.datastructure.tree.leetcode;

import com.datastructure.tree.TreeNode;

import java.util.ArrayList;

/**
 * Created by danzhu on 7/8/14.
 *
 * Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.

 For example:
 Given the below binary tree and sum = 22,
 5
 / \
 4   8
 /   / \
 11  13  4
 /  \    / \
 7    2  5   1
 return
 [
 [5,4,11,2],
 [5,8,4,5]
 ]
 *
 */
public class PathSumII {

    public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list = new ArrayList<Integer>();

        recursion(root, sum, result, list);
        return result;
    }

    public void recursion(TreeNode root, int sum, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list){
        if(root == null) return;

        list.add(root.val);

        if(root.left == null && root.right == null && (sum - root.val) == 0){
            ArrayList<Integer> newList = new ArrayList<Integer>(list);
            result.add(newList);
        }

        recursion(root.left, sum - root.val, result, list);
        recursion(root.right, sum - root.val, result, list);
        list.remove(list.size()-1);
    }
}
