package com.datastructure.tree.leetcode;

import com.datastructure.tree.TreeNode;

/**
 * Created by danzhu on 9/13/14.
 * Given inorder and postorder traversal of a tree, construct the binary tree.

 Note:
 You may assume that duplicates do not exist in the tree.

 */
public class ConstructTreeFromPostInorder {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTreeFromInPostOrder(postorder, 0, postorder.length-1, inorder, 0, inorder.length-1);
    }

    public TreeNode buildTreeFromInPostOrder(int[] postorder, int postStart, int postEnd, int[] inorder, int inStart, int inEnd){
        if(postStart > postEnd)
            return null;

        TreeNode node = new TreeNode(postorder[postEnd]);
        if(postStart == postEnd)
            return node;

        int index = inStart;
        while(index <= inEnd){
            if(inorder[index] == postorder[postEnd])
                break;
            index++;
        }
        int rightLength = inEnd-index;
        node.right = buildTreeFromInPostOrder(postorder, postEnd-rightLength, postEnd-1, inorder, index+1, inEnd);
        node.left = buildTreeFromInPostOrder(postorder, postStart, postEnd-rightLength-1, inorder, inStart, index-1);
        return node;
    }
}
