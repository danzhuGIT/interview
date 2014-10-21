package com.datastructure.array.leetcode;

/**
 * Created by danzhu on 7/10/14.
 *
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

 For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
 the contiguous subarray [4,−1,2,1] has the largest sum = 6.

 click to show more practice.

 More practice:
 If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 *
 */
public class MaxmiumSubarray {
    //dp O(n)
    public int maxSubArray(int[] A) {
        int max = A[0];
        int[] sum = new int[A.length];
        sum[0] = A[0];
        for(int i = 1; i < A.length; i++){
            sum[i] = Math.max(sum[i-1]+A[i], A[i]);
            max = Math.max(max, sum[i]);
        }
        return max;
    }

    //Divide and Conquer
    public int maxSubArrayDC(int[] A) {
        int maxV = Integer.MIN_VALUE;
        return maxArray(A, 0, A.length-1, maxV);
    }
    public int maxArray(int A[], int left, int right, int maxV)
    {
        if(left>right)
            return Integer.MIN_VALUE;
        int mid = (left+right)/2;
        int lmax = maxArray(A, left, mid -1, maxV);
        int rmax = maxArray(A, mid + 1, right, maxV);
        maxV = Math.max(maxV, lmax);
        maxV = Math.max(maxV, rmax);
        int sum = 0, mlmax = 0;
        for(int i= mid -1; i>=left; i--)
        {
            sum += A[i];
            if(sum > mlmax)
                mlmax = sum;
        }
        sum = 0; int mrmax = 0;
        for(int i = mid +1; i<=right; i++)
        {
            sum += A[i];
            if(sum > mrmax)
                mrmax = sum;
        }
        maxV = Math.max(maxV, mlmax + mrmax + A[mid]);
        return maxV;
    }

    //
    public int maxSubArray3(int[] A) {
        //maxPos: maximum sum ending with current element
        int maxPos = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < A.length; i++){
            maxPos += A[i];
            max = Math.max(max, maxPos);
            if(maxPos < 0)
                maxPos = 0;
        }
        return max;

    }
}
