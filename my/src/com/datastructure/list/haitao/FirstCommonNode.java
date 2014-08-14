package com.datastructure.list.haitao;

import com.datastructure.list.ListNode;

/**
 * Created by danzhu on 8/12/14.
 * 题目：两个单向链表，找出它们的第一个公共结点。
 */
public class FirstCommonNode {
    public static void main(String[] args){
        ListNode e=new ListNode(5,null);
        ListNode d=new ListNode(4,e);
        ListNode c=new ListNode(3,d);
        ListNode a=new ListNode(1,c);
        ListNode b=new ListNode(2,d);

        System.out.print(firstCommonNode(a,b).val);
    }

    //calculate length of each list
    public static ListNode firstCommonNode(ListNode l1, ListNode l2){
        int length1 = findLength(l1);
        int length2 = findLength(l2);

        int diff;
        ListNode longer;
        ListNode shorter;

        if(length1 > length2){
            longer = l1;
            shorter = l2;
            diff = length1 - length2;
        }else{
            longer = l2;
            shorter = l1;
            diff = length2 - length1;
        }

        for(int i = 0; i < diff; i++){
            longer = longer.next;
        }

        while(longer != null && shorter != null && longer != shorter){
            longer = longer.next;
            shorter = shorter.next;
        }

        return shorter;
    }

    static int findLength(ListNode node){
        int length = 0;
        while(node != null){
            length++;
            node = node.next;
        }
        return length;
    }
}
