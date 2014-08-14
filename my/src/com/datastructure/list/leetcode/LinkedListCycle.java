package com.datastructure.list.leetcode;

import com.datastructure.list.ListNode;

/**
 * Created by danzhu on 7/1/14.
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        if(head == null) return false;

        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow)
                return true;
        }
        return false;
    }
}
