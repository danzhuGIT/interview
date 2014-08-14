package com.datastructure.list.leetcode;

import com.datastructure.list.ListNode;

/**
 * Created by danzhu on 7/1/14.
 */
public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;


        while(fast != null && slow != null){
            slow = slow.next;
            fast = fast.next;

            if(fast != null)
                fast = fast.next;

            if(fast == slow)
                break;
        }

        if(fast == null || fast.next != null) return null;

        ListNode start = head;
        while(start != fast){
            start = start.next;
            fast = fast.next;
        }
        return start;
    }
}
