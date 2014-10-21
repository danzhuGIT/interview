package com.datastructure.list.leetcode;

/**
 * Created by danzhu on 10/15/14.
 *
 * A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null.

 Return a deep copy of the list.
 *
 */

import java.util.HashMap;

/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class CopyListWithRandomPointer {
    public RandomListNode copyRandomList(RandomListNode head) {
        RandomListNode fakeHead = new RandomListNode(0);
        RandomListNode pre = fakeHead;

        HashMap<RandomListNode, RandomListNode> visited = new HashMap<RandomListNode, RandomListNode>();
        RandomListNode cur = head;
        while(cur!=null){
            RandomListNode newNode;
            if(!visited.containsKey(cur)){
                newNode = new RandomListNode(cur.label);
                visited.put(cur, newNode);
            }else{
                newNode = visited.get(cur);
            }

            if(cur.random!=null){
                RandomListNode newRandomNode;
                if(!visited.containsKey(cur.random)){
                    newRandomNode = new RandomListNode(cur.random.label);
                    visited.put(cur.random, newRandomNode);
                }else{
                    newRandomNode = visited.get(cur.random);
                }
                newNode.random = newRandomNode;
            }

            pre.next = newNode;
            pre = newNode;
            cur = cur.next;
        }
        return fakeHead.next;
    }
}
