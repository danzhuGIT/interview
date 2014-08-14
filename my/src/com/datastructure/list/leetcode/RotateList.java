package com.datastructure.list.leetcode;

import com.datastructure.list.ListNode;

/**
 * Created by danzhu on 7/10/14.
 *
 * Given a list, rotate the list to the right by k places, where k is non-negative.

 For example:
 Given 1->2->3->4->5->NULL and k = 2,
 return 4->5->1->2->3->NULL.
 *
 */
public class RotateList {

    public ListNode rotateRight(ListNode head, int n) {
        if(head == null || head.next == null)    return head;

        int length = 1;
        ListNode runner = head;
        while(runner.next != null){
            length++;
            runner = runner.next;
        }

        runner.next = head;
        int k = length - n % length;
        while(k > 0){
            runner = runner.next;
            k--;
        }

        head = runner.next;
        runner.next = null;
        return head;
    }

}
