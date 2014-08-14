package com.algorithm.BFS.leetcode;

import com.datastructure.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by danzhu on 7/5/14.
 *
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

 For example:
 Given binary tree {3,9,20,#,#,15,7},
 3
 / \
 9  20
 /  \
 15   7
 return its level order traversal as:
 [
 [3],
 [9,20],
 [15,7]
 ]
 *
 */
public class LevelOrderTraversal {
    public static void main(String[] args){
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        one.left = two;
        one.right = three;
        //ArrayList<ArrayList<Integer>> result = levelOrder(one);
    }

    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        LinkedList<TreeNode> currentLevel = new LinkedList<TreeNode>();
        LinkedList<TreeNode> nextLevel = new LinkedList<TreeNode>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

        if(root == null)    return result;

        currentLevel.push(root);
        while(!currentLevel.isEmpty()){
            ArrayList<Integer> levelNodes = new ArrayList<Integer>();
            TreeNode currentNode = currentLevel.poll();
            while(currentNode != null){
                levelNodes.add(currentNode.val);
                if(currentNode.left != null)    nextLevel.add(currentNode.left);
                if(currentNode.right != null)    nextLevel.add(currentNode.right);
                currentNode = currentLevel.poll();
            }
            result.add(levelNodes);
            LinkedList<TreeNode> temp = currentLevel;
            currentLevel = nextLevel;
            nextLevel = temp;
        }
        return result;
    }
}
