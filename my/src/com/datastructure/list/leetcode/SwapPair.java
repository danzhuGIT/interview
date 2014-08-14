package com.datastructure.list.leetcode;

import com.datastructure.list.ListNode;

/**
 * Created by danzhu on 7/6/14.
 *
 * Given a linked list, swap every two adjacent nodes and return its head.

 For example,
 Given 1->2->3->4, you should return the list as 2->1->4->3.

 Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
 *
 */
public class SwapPair {
    public ListNode swapPairs(ListNode head) {
        ListNode fakeHead = new ListNode(-1);
        fakeHead.next = head;
        ListNode previous = fakeHead;
        ListNode current = head;

        while(current != null && current.next != null){
            previous.next = current.next;
            current.next = current.next.next;
            previous.next.next = current;

            previous = current;
            current = current.next;
        }
        return fakeHead.next;
    }

}
