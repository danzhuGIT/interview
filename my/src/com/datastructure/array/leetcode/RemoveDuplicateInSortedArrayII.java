package com.datastructure.array.leetcode;

/**
 * Created by danzhu on 7/24/14.
 *
 * Follow up for "Remove Duplicates":
 What if duplicates are allowed at most twice?

 For example,
 Given sorted array A = [1,1,1,2,2,3],

 Your function should return length = 5, and A is now [1,1,2,2,3].
 *
 */
public class RemoveDuplicateInSortedArrayII {
    public int removeDuplicates(int[] A) {
        if(A.length < 2)
            return A.length;

        int cur = 1;
        int pre = 1;
        int count = 1;
        while(cur < A.length){
            if(A[cur] == A[cur-1]){
                if(count >= 2){
                    cur++;
                    continue;
                } else {
                    count++;
                }
            } else {
                count = 1;
            }
            A[pre]=A[cur];
            pre++;
            cur++;
        }
        return pre;
    }
}
