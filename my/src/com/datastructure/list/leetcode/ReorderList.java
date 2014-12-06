package com.datastructure.list.leetcode;

import com.datastructure.list.ListNode;

/**
 * Created by danzhu on 7/2/14.
 *
 * Given a singly linked list L: L0→L1→…→Ln-1→Ln,
 reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…

 You must do this in-place without altering the nodes' values.

 For example,
 Given {1,2,3,4}, reorder it to {1,4,2,3}.
 *
 */
public class ReorderList {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;

        ListNode fast = head;
        ListNode slow = head;
        //find the middle of list
        //1,2,3,4 and 1,2,3 is 2
        while(fast.next!=null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode middle = slow;
        ListNode tail = slow.next;

        //reverse second part
        while(tail.next != null){
            ListNode temp = middle.next;
            middle.next = tail.next;
            tail.next = tail.next.next;
            middle.next.next = temp;
        }

        //merge the two part
        ListNode h = head;
        while(h != middle){
            ListNode temp = h.next;
            h.next = middle.next;
            middle.next = middle.next.next;
            h.next.next = temp;
            h = h.next.next;
        }
    }
}
