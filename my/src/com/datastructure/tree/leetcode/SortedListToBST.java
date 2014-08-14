package com.datastructure.tree.leetcode;

import com.datastructure.list.ListNode;
import com.datastructure.tree.TreeNode;

/**
 * Created by danzhu on 7/11/14.
 *
 * Given a singly linked list where elements are sorted in ascending order, convert it to a height balanced BST.
 */
public class SortedListToBST {

    public TreeNode sortedListToBST(ListNode head) {
        if(head == null)    return null;
        ListNode temp = head;
        int length = 0;
        while(temp != null){
            length++;
            temp = temp.next;
        }
        ListNode[] curr = new ListNode[1];
        curr[0] = head;
        return recursion(curr, 0, length - 1);
    }

    private TreeNode recursion(ListNode[] curr, int start, int end){
        if(start > end) return null;

        int mid = (start+end)/2;

        TreeNode left = recursion(curr, start, mid-1);
        TreeNode root = new TreeNode(curr[0].val);
        curr[0] = curr[0].next;
        TreeNode right = recursion(curr, mid+1, end);
        root.left = left;
        root.right = right;

        return root;
    }

}
