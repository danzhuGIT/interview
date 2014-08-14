package com.datastructure.tree.leetcode;

/**
 * Created by danzhu on 7/5/14.
 *
 * Follow up for problem "Populating Next Right Pointers in Each Node".

 What if the given tree could be any binary tree? Would your previous solution still work?

 Note:

 You may only use constant extra space.
 For example,
 Given the following binary tree,
 1
 /  \
 2    3
 / \    \
 4   5    7
 After calling your function, the tree should look like:
 1 -> NULL
 /  \
 2 -> 3 -> NULL
 / \    \
 4-> 5 -> 7 -> NULL
 *
 */
public class PopulateNextRightII {
    public void connect(TreeLinkNode root) {
        if(root == null)    return;

        TreeLinkNode curr = root;
        TreeLinkNode prev = null;
        TreeLinkNode nextLevel = null;

        while(curr != null){
            if(curr.left!=null){
                if(prev!=null)
                    prev.next = curr.left;
                prev = curr.left;
                if(nextLevel==null)
                    nextLevel = curr.left;
            }
            if(curr.right!=null){
                if(prev!=null)
                    prev.next = curr.right;
                prev = curr.right;
                if(nextLevel==null)
                    nextLevel = curr.right;
            }
            curr = curr.next;
        }
        connect(nextLevel);
    }
}
