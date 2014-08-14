package com.topic.search.leetcode;

/**
 * Created by danzhu on 7/6/14.
 *
 * Given a sorted array of integers, find the starting and ending position of a given target value.

 Your algorithm's runtime complexity must be in the order of O(log n).

 If the target is not found in the array, return [-1, -1].

 For example,
 Given [5, 7, 7, 8, 8, 10] and target value 8,
 return [3, 4].

 */

//copy
public class SearchRange {

    public int[] searchRange(int[] A, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function

        int[] ret = new int[2];
        ret[0] = bs(A, target-1) + 1;
        ret[1] = bs(A, target);

        if (ret[1] == -1 || A[ret[1]] != target) {
            ret[0] = -1;
            ret[1] = -1;
        }

        return ret;
    }
    //return the biggest index of element smaller than or equal to x
//if any element in a is bigger than x, return -1
//the following is used often, just remember it.
    public int bs (int[] a, int x) {
        int start = 0, end = a.length-1, mid = (a.length-1)/2;
        int ret = -1;

        while (start <= end) {
            if (a[mid] > x) {
                end = mid-1;
                mid = (start+end)/2;
            }
            else {
                start = mid+1;
                ret = mid;
                mid = (start+end)/2;
            }
        }

        return ret;
    }

}
