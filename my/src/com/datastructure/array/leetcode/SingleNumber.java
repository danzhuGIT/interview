package com.datastructure.array.leetcode;

/**
 * Created by danzhu on 6/30/14.
 */
public class SingleNumber {
    public int singleNumber(int[] A) {
        int x = 0;
        for(int a : A){
            x = x ^ a;
        }
        return x;
    }
}
