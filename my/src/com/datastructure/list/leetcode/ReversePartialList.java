package com.datastructure.list.leetcode;

import com.datastructure.list.ListNode;

/**
 * Created by danzhu on 7/8/14.
 *
 * Reverse a linked list from position m to n. Do it in-place and in one-pass.

 For example:
 Given 1->2->3->4->5->NULL, m = 2 and n = 4,

 return 1->4->3->2->5->NULL.

 Note:
 Given m, n satisfy the following condition:
 1 ≤ m ≤ n ≤ length of list.
 *
 */
public class ReversePartialList {

    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null || m == n)  return head;

        ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;
        ListNode start = head;
        ListNode prev = fakeHead;
        for(int i = 0; i < m-1; i++){
            prev = prev.next;
            start = start.next;
        }
        int length = n - m + 1;
        for(int i = 0; i < length - 1; i++){
            ListNode temp = start.next;
            start.next = start.next.next;
            temp.next = prev.next;
            prev.next = temp;
        }

        return fakeHead.next;
    }

}
