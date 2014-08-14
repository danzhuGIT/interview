package com.datastructure.list.leetcode;

import com.datastructure.list.ListNode;

/**
 * Created by danzhu on 7/28/14.
 * Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.

 If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.

 You may not alter the values in the nodes, only nodes itself may be changed.

 Only constant memory is allowed.

 For example,
 Given this linked list: 1->2->3->4->5

 For k = 2, you should return: 2->1->4->3->5

 For k = 3, you should return: 3->2->1->4->5
 */
public class ReverseKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;
        ListNode pre = fakeHead;
        ListNode cur = head;

        while(cur != null){
            int i = 0;
            cur = pre.next;
            while(i < k && cur!=null){
                i++;
                cur = cur.next;
            }
            if(i == k){
                ListNode tail = pre.next;
                for(int j = 0; j < k-1; j++){
                    cur = tail.next;
                    tail.next = cur.next;
                    cur.next = pre.next;
                    pre.next = cur;
                }
                pre = tail;
            }
        }
        return fakeHead.next;
    }
}
