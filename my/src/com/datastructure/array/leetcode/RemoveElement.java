package com.datastructure.array.leetcode;

/**
 * Created by danzhu on 10/20/14.
 *
 * Given an array and a value, remove all instances of that value in place and return the new length.

 The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 */
public class RemoveElement {
    public int removeElement(int[] A, int elem) {
        int i = -1;
        int j = 0;
        while(j < A.length){
            if(A[j] != elem){
                A[++i] = A[j];
            }
            j++;
        }
        return i+1;
    }

}
