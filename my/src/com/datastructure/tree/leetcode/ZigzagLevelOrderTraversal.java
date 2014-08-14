package com.datastructure.tree.leetcode;

import java.util.ArrayList;
import java.util.Stack;
import com.datastructure.tree.TreeNode;


/**
 * Created by danzhu on 7/5/14.
 *
 * Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).

 For example:
 Given binary tree {3,9,20,#,#,15,7},
 3
 / \
 9  20
 /  \
 15   7
 return its zigzag level order traversal as:
 [
 [3],
 [20,9],
 [15,7]
 ]
 *
 */
public class ZigzagLevelOrderTraversal {
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
        Stack<TreeNode> currentLevel = new Stack<TreeNode>();
        Stack<TreeNode> nextLevel = new Stack<TreeNode>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        boolean leftToRight = true;

        if(root == null)    return result;

        currentLevel.push(root);
        while(!currentLevel.empty()){
            ArrayList<Integer> levelNodes = new ArrayList<Integer>();
            TreeNode currentNode;
            while(!currentLevel.empty()){
                currentNode = currentLevel.pop();
                levelNodes.add(currentNode.val);
                if(leftToRight){
                    if(currentNode.left != null)    nextLevel.push(currentNode.left);
                    if(currentNode.right != null)    nextLevel.push(currentNode.right);
                } else {
                    if(currentNode.right != null)    nextLevel.push(currentNode.right);
                    if(currentNode.left != null)    nextLevel.push(currentNode.left);
                }
            }
            result.add(levelNodes);
            Stack<TreeNode> temp = currentLevel;
            currentLevel = nextLevel;
            nextLevel = temp;
            leftToRight = !leftToRight;
        }
        return result;
    }
}
