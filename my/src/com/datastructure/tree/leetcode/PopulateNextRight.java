package com.datastructure.tree.leetcode;

/**
 * Created by danzhu on 7/5/14.
 *
 * Given a binary tree

 struct TreeLinkNode {
 TreeLinkNode *left;
 TreeLinkNode *right;
 TreeLinkNode *next;
 }
 Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.

 Initially, all next pointers are set to NULL.

 Note:

 You may only use constant extra space.
 You may assume that it is a perfect binary tree (ie, all leaves are at the same level, and every parent has two children).
 For example,
 Given the following perfect binary tree,
 1
 /  \
 2    3
 / \  / \
 4  5  6  7
 After calling your function, the tree should look like:
 1 -> NULL
 /  \
 2 -> 3 -> NULL
 / \  / \
 4->5->6->7 -> NULL
 *
 */
public class PopulateNextRight {
    public void connect(TreeLinkNode root) {
        if(root == null)
            return;

        if(root.left!=null){
            TreeLinkNode curr = root;
            TreeLinkNode currNext;
            while(curr!=null){
                currNext = curr.next;
                curr.left.next = curr.right;
                if(currNext!=null){
                    curr.right.next = currNext.left;
                }
                curr = curr.next;
            }
        }
        connect(root.left);
    }
}
