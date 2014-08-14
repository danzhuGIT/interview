package com.datastructure.list.leetcode;

import com.datastructure.list.ListNode;

/**
 * Created by danzhu on 7/8/14.
 *
 * Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.

 For example,
 Given 1->2->3->3->4->4->5, return 1->2->5.
 Given 1->1->1->2->3, return 2->3.
 *
 */
public class RemoveDuplicateII {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)    return head;

        ListNode fakeHead = new ListNode(head.val - 1);
        fakeHead.next = head;
        ListNode tail = fakeHead;
        ListNode runner = head;
        while(runner != null){
            ListNode start = runner;
            runner = start.next;
            if(runner == null || runner.val != start.val){
                tail = start;
            } else {
                while(runner != null && runner.val == start.val){
                    runner = runner.next;
                }
                tail.next = runner;
            }
        }
        return fakeHead.next;
    }
}
