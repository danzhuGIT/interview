package com.datastructure.array.leetcode;

/**
 * Created by danzhu on 7/3/14.
 */
public class MergeSortedArray {
    public void merge(int A[], int m, int B[], int n) {
        int a = m - 1;
        int b = n - 1;
        int i = m + n - 1;

        for(; i >= 0 && a >= 0 && b >= 0; i--){
            if(A[a] > B[b]){
                A[i] = A[a];
                a--;
            } else {
                A[i] = B[b];
                b--;
            }
        }

        while(b >= 0){
            A[i] = B[b];
            i--;
            b--;
        }
    }
}
