package com.datastructure.list.leetcode;

import com.datastructure.list.ListNode;

/**
 * Created by danzhu on 7/29/14.
 * You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

 Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 Output: 7 -> 0 -> 8
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode fakeHead = new ListNode(0);
        int carry = 0;
        ListNode pre = fakeHead;
        while(l1!=null || l2!=null || carry!=0){
            int digit = carry;
            if(l1 != null){
                digit += l1.val;
                l1=l1.next;
            }
            if(l2 != null){
                digit += l2.val;
                l2=l2.next;
            }

            ListNode newNode = new ListNode(digit%10);
            carry = digit/10;
            pre.next = newNode;
            pre = pre.next;
        }
        return fakeHead.next;
    }
}
