package com.datastructure.list.leetcode;

import com.datastructure.list.ListNode;

/**
 * Created by danzhu on 7/23/14.
 * Sort a linked list in O(n log n) time using constant space complexity.
 */
public class SortList {
    public ListNode sortList(ListNode head) {
        return sort(head);
    }

    private ListNode sort(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode right = slow.next;
        slow.next = null;
        ListNode left = head;
        return merge(sort(left), sort(right));
    }

    private ListNode merge(ListNode l1, ListNode l2){
        ListNode fakeHead = new ListNode(-1);
        ListNode cur = fakeHead;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        if(l1 != null){
            cur.next = l1;
        }
        if(l2 != null){
            cur.next = l2;
        }
        return fakeHead.next;
    }
}
