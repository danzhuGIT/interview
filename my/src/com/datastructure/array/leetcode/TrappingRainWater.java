package com.datastructure.array.leetcode;

/**
 * Created by danzhu on 8/2/14.
 * Given n non-negative integers representing an elevation map where the width of each bar is 1,
 * compute how much water it is able to trap after raining.

 For example,
 Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.


 The above elevation map is represented by array [0,1,0,2,1,0,1,3,2,1,2,1].
 In this case, 6 units of rain water (blue section) are being trapped. Thanks Marcos for contributing this image!
 */
public class TrappingRainWater {
    public int trap(int[] A) {
        int sum = 0;
        int i = 0;
        int j = A.length-1;
        while(i < j){
            while(i < j && A[i]<=A[i+1])
                i++;
            while(j > i && A[j]<=A[j-1])
                j--;

            if(i==j)
                return sum;

            if(A[i] < A[j]){
                int k = i+1;
                for(; k < j && A[k] <= A[i]; k++){
                    sum += A[i] - A[k];
                }
                i = k;
            } else {
                int k = j-1;
                for(; k > i && A[k] <= A[j]; k--){
                    sum += A[j] - A[k];
                }
                j = k;
            }

        }
        return sum;
    }
}
