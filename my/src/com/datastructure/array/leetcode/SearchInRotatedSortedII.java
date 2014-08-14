package com.datastructure.array.leetcode;

/**
 * Created by danzhu on 7/24/14.
 * Follow up for "Search in Rotated Sorted Array":
 What if duplicates are allowed?

 Would this affect the run-time complexity? How and why?

 Write a function to determine if a given target is in the array.
 */
public class SearchInRotatedSortedII {
    public boolean search(int[] A, int target) {
        int l = 0;
        int r = A.length-1;
        int m;

        while(l <= r){
            m = (l+r)/2;

            if(A[m] == target)
                return true;

            if(A[l]<A[m]){
                if(A[m]>target && A[l] <= target)
                    r = m-1;
                else
                    l = m+1;
            } else if(A[l]>A[m]){
                if(A[m]<target && A[r] >= target)
                    l=m+1;
                else
                    r = m-1;
            } else {
                l++;
            }

        }
        return false;
    }
}
