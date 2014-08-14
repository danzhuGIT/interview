package com.datastructure.tree.leetcode;

import com.datastructure.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by danzhu on 7/5/14.
 *
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

 For example:
 Given binary tree {3,9,20,#,#,15,7},
 3
 / \
 9  20
 /  \
 15   7
 return its bottom-up level order traversal as:
 [
 [15,7],
 [9,20],
 [3]
 ]
 *
 */
public class LevelOrderTraversalII {
    public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
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

        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        for(int i = result.size()-1; i>=0; i--){
            list.add(result.get(i));
        }

        return list;
    }
}
