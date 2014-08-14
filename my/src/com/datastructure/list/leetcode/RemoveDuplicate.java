package com.datastructure.list.leetcode;

import com.datastructure.list.ListNode;

/**
 * Created by danzhu on 7/8/14.
 *
 * Given a sorted linked list, delete all duplicates such that each element appear only once.

 For example,
 Given 1->1->2, return 1->2.
 Given 1->1->2->3->3, return 1->2->3.
 *
 */
public class RemoveDuplicate {

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)    return head;

        ListNode tail = head;
        while(tail.next != null){
            if(tail.next.val == tail.val){
                tail.next = tail.next.next;
            } else {
                tail = tail.next;
            }
        }
        return head;
    }

}
