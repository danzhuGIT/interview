package com.datastructure.list.leetcode;

/**
 * Created by danzhu on 8/1/14.
 */
public class LRUCacheMain {
    public static void main(String[] args){
        LRUCache cache = new LRUCache(3);

        cache.set(1,1);
        cache.set(2,2);
        cache.set(3,3);
        cache.set(4,4);
        System.out.print(cache.get(4)+" ");
        System.out.print(cache.get(3)+" ");
        System.out.print(cache.get(2)+" ");
        System.out.print(cache.get(1)+" ");
        cache.set(5,5);
        System.out.print(cache.get(1)+" ");
        System.out.print(cache.get(2)+" ");
        System.out.print(cache.get(3)+" ");
        System.out.print(cache.get(4)+" ");
        System.out.print(cache.get(5)+" ");



    }
}
