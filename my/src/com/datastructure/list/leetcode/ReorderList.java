package com.datastructure.list.leetcode;

import com.datastructure.list.ListNode;

/**
 * Created by danzhu on 7/2/14.
 */
public class ReorderList {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;

        ListNode fast = head;
        ListNode slow = head;

        while(fast.next!=null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode middle = slow;
        ListNode tail = slow.next;

        while(tail.next != null){
            ListNode temp = middle.next;
            middle.next = tail.next;
            tail.next = tail.next.next;
            middle.next.next = temp;
        }

        ListNode h = head;
        while(h != middle && middle.next != null){
            ListNode temp = h.next;
            h.next = middle.next;
            middle.next = middle.next.next;
            h.next.next = temp;
            h = h.next.next;
        }
    }
}
