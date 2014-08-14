package com.datastructure.array.leetcode;

/**
 * Created by danzhu on 7/24/14.
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

 Do not allocate extra space for another array, you must do this in place with constant memory.

 For example,
 Given input array A = [1,1,2],

 Your function should return length = 2, and A is now [1,2].
 */
public class RemoveDuplicateInSortedArray {
    public int removeDuplicates(int[] A) {
        if(A.length < 2)
            return A.length;
        int i=1;
        int j=0;

        while(i<A.length){
            if(A[i] ==A[j]){
                i++;
            }else{
                j++;
                A[j]=A[i];
                i++;
            }

        }
        return j+1;
    }
}
