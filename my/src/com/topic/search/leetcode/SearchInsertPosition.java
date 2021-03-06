package com.topic.search.leetcode;

/**
 * Created by danzhu on 7/11/14.
 *
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

 You may assume no duplicates in the array.

 Here are few examples.
 [1,3,5,6], 5 → 2
 [1,3,5,6], 2 → 1
 [1,3,5,6], 7 → 4
 [1,3,5,6], 0 → 0
 *
 */
public class SearchInsertPosition {

    public int searchInsert(int[] A, int target) {
        int result = 0;
        int start = 0;
        int end = A.length-1;
        int mid = (start+end)/2;
        while(start <= end){
            if(A[mid] == target){
                return mid;
            } else if(A[mid] > target){
                end = mid-1;
                mid = (start+end)/2;
            }else{
                result = mid;
                start = mid+1;
                mid = (start+end)/2;
            }
        }
        if(A[result] < target)  result++;
        return result;
    }

}
