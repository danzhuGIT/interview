package com.datastructure.tree.leetcode;

import java.util.ArrayList;
import java.util.List;
import com.datastructure.tree.TreeNode;

/**
 * Created by danzhu on 7/23/14.
 *
 * Given n, generate all structurally unique BST's (binary search trees) that store values 1...n.

 For example,
 Given n = 3, your program should return all 5 unique BST's shown below.

 1         3     3      2      1
 \       /     /      / \      \
 3     2     1      1   3      2
 /     /       \                 \
 2     1         2                 3
 *
 */
public class UniqueBSTII {
    public List<TreeNode> generateTrees(int n) {
        ArrayList<TreeNode> result = new ArrayList<TreeNode>();
        generate(result, 1, n);
        return result;
    }

    public void generate(ArrayList<TreeNode> trees, int start, int end){
        if(start > end){
            trees.add(null);
            return;
        }

        if(start == end){
            TreeNode newNode = new TreeNode(start);
            trees.add(newNode);
            return;
        }

        for(int i = start; i <= end; i++){
            ArrayList<TreeNode> leftTrees = new ArrayList<TreeNode>();
            generate(leftTrees, start, i-1);

            for(int j = 0; j < leftTrees.size(); j++){
                ArrayList<TreeNode> rightTrees = new ArrayList<TreeNode>();
                generate(rightTrees, i+1, end);

                for(int k = 0; k < rightTrees.size(); k++){
                    TreeNode root = new TreeNode(i);
                    root.left = leftTrees.get(j);
                    root.right = rightTrees.get(k);
                    trees.add(root);
                }
            }
        }
    }
}
