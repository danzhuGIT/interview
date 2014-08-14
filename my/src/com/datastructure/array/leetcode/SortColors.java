package com.datastructure.array.leetcode;

/**
 * Created by danzhu on 7/10/14.
 *
 * Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.

 Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

 Note:
 You are not suppose to use the library's sort function for this problem.

 click to show follow up.

 Follow up:
 A rather straight forward solution is a two-pass algorithm using counting sort.
 First, iterate the array counting number of 0's, 1's, and 2's, then overwrite array with total number of 0's, then 1's and followed by 2's.

 Could you come up with an one-pass algorithm using only constant space?
 *
 */

//copy
public class SortColors {
    public void sortColors(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int l=0,i=0,r=A.length-1;
        while(i<=r){
            if(A[i]==0){
                swap(A,i,l);
                l++;
                i++;
            }
            else if(A[i]==2){
                swap(A,i,r);
                r--;
            }
            else
                i++;
        }
    }
    public void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j]= temp;
    }
}
