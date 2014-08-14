package com.datastructure.list.leetcode;

import java.util.HashMap;

/**
 * Created by danzhu on 7/18/14.
 * Design and implement a data structure for Least Recently Used (LRU) cache. It should support the following operations: get and set.

 get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
 set(key, value) - Set or insert the value if the key is not already present.
 When the cache reached its capacity, it should invalidate the least recently used item before inserting a new item.
 */
public class LRUCache {
    class DoubleLinkedListNode {
        int key;
        int val;
        DoubleLinkedListNode prev;
        DoubleLinkedListNode next;

        DoubleLinkedListNode(int key, int val){
            this.key = key;
            this.val = val;
        }

    }

    private int capacity;
    private DoubleLinkedListNode head;
    private DoubleLinkedListNode end;
    private int length = 0;
    private HashMap<Integer, DoubleLinkedListNode> map  = new HashMap<Integer, DoubleLinkedListNode>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if(!map.containsKey(key))
            return -1;
        else {
            DoubleLinkedListNode node = map.get(key);
            moveToHead(node);
            return node.val;
        }
    }

    public void set(int key, int value) {
        if(map.containsKey(key)){
            DoubleLinkedListNode node = map.get(key);
            node.val = value;
            moveToHead(node);
        } else {
            DoubleLinkedListNode node = new DoubleLinkedListNode(key, value);
            map.put(key, node);
            length++;
            insertToHead(node);
            if(length > capacity){
                map.remove(end.key);
                end = end.prev;
                end.next = null;
                length--;
            }
        }
    }

    private void moveToHead(DoubleLinkedListNode node){
        if(head == node)
            return;
        else {
            if(end == node){
                end = node.prev;
            }else{
                node.next.prev = node.prev;
            }
            node.prev.next = node.next;

            node.prev = null;
            node.next = head;
            head.prev = node;

            head = node;
        }
    }

    private void insertToHead(DoubleLinkedListNode node){
        if(head == null) {
            head = node;
            end = node;
        } else {
            head.prev = node;
            node.next = head;
            head = node;
        }
    }
}
