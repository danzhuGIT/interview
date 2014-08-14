package com.datastructure.list.leetcode;

import com.datastructure.list.ListNode;

/**
 * Created by danzhu on 7/6/14.
 *
 * Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

 You should preserve the original relative order of the nodes in each of the two partitions.

 For example,
 Given 1->4->3->2->5->2 and x = 3,
 return 1->2->2->4->3->5.
 *
 */
public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode fakeHead = new ListNode(x-1);
        fakeHead.next = head;
        ListNode partition = fakeHead;
        ListNode previous = fakeHead;
        ListNode current = head;
        while(current != null){
            if(current.val < x){
                if(previous.val >= x){
                    previous.next = current.next;
                    current.next = partition.next;
                    partition.next = current;
                } else {
                    previous = current;
                }
                partition = current;
            } else {
                previous = current;
            }
            current = previous.next;
        }

        return fakeHead.next;
    }
}
