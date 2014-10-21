package com.datastructure.array.leetcode;

/**
 * Created by danzhu on 10/15/14.
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.

 (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

 Find the minimum element.

 You may assume no duplicate exists in the array.
 */
public class FindMinInRotatedSorted {
    public int findMin(int[] num) {
        int start = 0;
        int end = num.length-1;

        while(start<=end){
            if(num[start] <= num[end])
                break;
            int mid = (start+end)/2;
            if(num[mid] >= num[start])
                start = mid+1;
            else{
                end = mid;
            }
        }

        return num[start];
    }
}
