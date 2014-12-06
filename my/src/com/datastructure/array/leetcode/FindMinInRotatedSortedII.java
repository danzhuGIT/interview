package com.datastructure.array.leetcode;

/**
 * Created by danzhu on 10/21/14.
 * Follow up for "Find Minimum in Rotated Sorted Array":
 What if duplicates are allowed?

 Would this affect the run-time complexity? How and why?
 Suppose a sorted array is rotated at some pivot unknown to you beforehand.

 (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

 Find the minimum element.

 The array may contain duplicates.
 */
public class FindMinInRotatedSortedII {
    public int findMin(int[] num) {
        int start = 0;
        int end = num.length-1;
        int middle;

        while(start<end){
            if(num[start] < num[end])
                break;

            if(num[start]==num[end]){
                start++;
                continue;
            }

            middle = (start+end)/2;
            if(num[middle]>=num[start])
                start=middle+1;
            else
                end = middle;
        }
        return num[start];
    }
}
