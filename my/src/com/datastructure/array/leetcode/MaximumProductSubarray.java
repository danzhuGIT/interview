package com.datastructure.array.leetcode;

/**
 * Created by danzhu on 9/24/14.
 * Find the contiguous subarray within an array (containing at least one number) which has the largest product.

 For example, given the array [2,3,-2,4],
 the contiguous subarray [2,3] has the largest product = 6.
 */
public class MaximumProductSubarray {
    public int maxProduct(int[] A) {
        int max = A[0];
        int k = 0;
        //check if there is no positive result
        for(; k < A.length; k++){
            max = Math.max(A[k], max);
            if(A[k] == 0)
                continue;
            else if(A[k] > 0)
                break;
            else if(k > 0 && A[k-1] < 0)
                break;
        }
        if(k == A.length)
            return max;

        //there is positive result
        max = A[0];
        int maxPositive = 1;
        int minNegative = 1;

        for(int i = 0; i < A.length; i++){
            if(A[i]==0){
                max = Math.max(max, 0);
                maxPositive = 1;
                minNegative = 1;
            }else {
                if(A[i]>0){
                    maxPositive *= A[i];
                    minNegative = Math.min(minNegative*A[i], 1);
                }else{
                    int temp = minNegative;
                    minNegative = maxPositive*A[i];
                    maxPositive = Math.max(temp*A[i],1);
                }
                max = Math.max(maxPositive, max);
            }

        }
        return max;
    }
}
