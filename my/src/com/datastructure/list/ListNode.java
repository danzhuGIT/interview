package com.datastructure.list;

/**
 * Created by danzhu on 7/1/14.
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
        next = null;
    }

    public ListNode(int x, ListNode next) {
        val = x;
        this.next = next;
    }
}
