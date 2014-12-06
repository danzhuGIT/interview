package com.datastructure.array.leetcode;

/**
 * Created by danzhu on 9/24/14.
 * Find the contiguous subarray within an array (containing at least one number) which has the largest product.

 For example, given the array [2,3,-2,4],
 the contiguous subarray [2,3] has the largest product = 6.

 f(k) = Largest product subarray, ending at k.
 g(k) = Smallest product subarray, ending at k.

 f(k) = max( f(k-1) * A[k], A[k], g(k-1) * A[k] )
 g(k) = min( f(k-1) * A[k], A[k], g(k-1) * A[k] )

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

    public int maxProductII(int[] A) {
        if(A == null || A.length < 1)
            return Integer.MIN_VALUE;

        int result, max, min;
        max = min = result = A[0];
        int mx, mn;
        for(int i = 1; i < A.length; i++){
            mx = max;
            mn = min;
            max = Math.max(Math.max(mx*A[i], A[i]), mn*A[i]);
            min = Math.min(Math.min(mx*A[i], A[i]), mn*A[i]);
            result = Math.max(result, max);
        }
        return result;
    }
}
