package com.datastructure.tree.careercup;

import com.datastructure.tree.TreeNode;

/**
 * Created by danzhu on 8/25/14.
 *
 * Given a binary tree where all the right nodes are leaf nodes, flip it upside down and turn it into a tree with left leaf nodes.

 Keep in mind: ALL RIGHT NODES IN ORIGINAL TREE ARE LEAF NODE.


 /* for example, turn these:
 *
 *        1                 1
 *       / \                 / \
 *      2   3            2   3
 *     / \
 *    4   5
 *   / \
 *  6   7
 *
 * into these:
 *
 *        1               1
 *       /               /
 *      2---3         2---3
 *     /
 *    4---5
 *   /
 *  6---7
 *
 * where 6 is the new root node for the left tree, and 2 for the right tree.
 * oriented correctly:
 *
 *     6                   2
 *    / \                   / \
 *   7   4              3   1
 *        / \
 *       5   2
 *            / \
 *          3   1
 */
public class FlipTree {
    public static void main(String[] args){
        TreeNode one = new TreeNode(1);
        TreeNode two  = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four  = new TreeNode(4);
        TreeNode five  = new TreeNode(5);
        one.left = two;
        one.right = three;
        two.left = four;
        two.right = five;

        flipTree(one).print();
    }

    /*
    1. Recursively traverse to the leftmost node.
    2. This becomes the NewRoot, and keep returning this value, up the chain.
    3. Make the following changes
    - CurrentRoot. Left.Left = CurrentRoot.Right
    - CurrentRoot.Left.Right = CurrentRoot
    - CurrentRoot.Left = CurrentRoot.Right = NULL
     */
    public static TreeNode flipTree(TreeNode root){
        if(root == null)
            return null;

        if(root.left == null && root.right == null)
            return root;

        TreeNode node = flipTree(root.left);
        root.left.right = root;
        root.left.left = root.right;
        root.left = null;
        root.right = null;

        return node;
    }
}
