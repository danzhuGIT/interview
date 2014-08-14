package com.datastructure.list.leetcode;

import com.datastructure.list.ListNode;

/**
 * Created by danzhu on 7/6/14.
 *
 * Merge two sorted linked lists and
 * return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 *
 */
public class MergeSortedList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        ListNode head;
        if(l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            head = l1;
        } else {
            l2.next = mergeTwoLists(l2.next, l1);
            head = l2;
        }
        return head;
    }
}
