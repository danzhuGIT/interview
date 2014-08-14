package com.datastructure.list.leetcode;

import com.datastructure.list.ListNode;

import java.util.List;

/**
 * Created by danzhu on 8/2/14.
 * Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
 */
public class MergeKSortedList {
    //n*k^2
    public ListNode mergeKLists(List<ListNode> lists){
        ListNode head=null;
        for(ListNode list:lists){
            head=merge(head,list);
        }
        return head;
    }
    static ListNode merge(ListNode head1,ListNode head2){
        if (head1==null||head2==null){
            return head1==null? head2:head1;
        }
        if(head1.val<head2.val){
            head1.next=merge(head1.next,head2);
            return head1;
        }
        else{
            head2.next=merge(head1,head2.next);
            return head2;
        }

    }
}
