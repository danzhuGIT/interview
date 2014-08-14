package com.datastructure.tree.cracking;

import java.util.ArrayList;

/**
 * Created by danzhu on 8/4/14.
 * You are given a binary tree in which each node contains a value.
 * Design an algorithm to print all paths which sum up to that value.
 * Note that it can be any path in the tree - it does not have to start at the root.
 */
public class PathSum {
    public static void main(String[] args){
        TreeNode four  = new TreeNode(4);
        TreeNode three  = new TreeNode(3);
        TreeNode two  = new TreeNode(2);
        TreeNode one  = new TreeNode(1);
        TreeNode five  = new TreeNode(5);
        TreeNode six  = new TreeNode(6);

        four.left = two;
        four.right = six;
        six.left = five;
        two.right = three;
        two.left = one;

        ArrayList<ArrayList<TreeNode>> result = new ArrayList<ArrayList<TreeNode>>();
        ArrayList<TreeNode> list = new ArrayList<TreeNode>();
        pathSum(four, result, list, 3);
        System.out.print(result);

    }

    // time and space is nlogn
    public static void pathSum(TreeNode node, ArrayList<ArrayList<TreeNode>> result, ArrayList<TreeNode> list, int target){
        if(node == null)
            return;

        list.add(node);
        int sum = 0;
        for(int i = list.size()-1; i>=0; i--){
            sum+=list.get(i).val;
            if(sum == target){
                ArrayList<TreeNode> sol = new ArrayList<TreeNode>();
                for(int j = i; j < list.size(); j++){
                    sol.add(list.get(j));
                }
                result.add(sol);
            }

        }
        pathSum(node.left, result, new ArrayList<TreeNode>(list), target);
        pathSum(node.right, result, new ArrayList<TreeNode>(list), target);
    }
}
