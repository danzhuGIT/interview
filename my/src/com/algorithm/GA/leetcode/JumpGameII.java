package com.algorithm.GA.leetcode;

/**
 * Created by danzhu on 7/12/14.
 *
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.

 Each element in the array represents your maximum jump length at that position.

 Your goal is to reach the last index in the minimum number of jumps.

 For example:
 Given array A = [2,3,1,1,4]

 The minimum number of jumps to reach the last index is 2. (Jump 1 step from index 0 to 1, then 3 steps to the last index.)
 */
public class JumpGameII {
    public int jump(int[] A) {
        int n = A.length;
        int start = 0;
        int end = 0;
        int farthest = 0;
        int count = 0;
        if(n==1)    return 0;
        while(start <= farthest){
            count++;
            end = farthest;
            for(int i = start; i <= end; i++){
                if(A[i]+i >= n-1)
                    return count;
                if(A[i]+i >= farthest)
                    farthest = A[i]+i;
            }
            start = end+1;
        }
        return 0;
    }

/*
//dp: time limit exceeded
    public int jump(int[] arr){
        int n=arr.length;
        int[] table=new int[n];
        table[n-1]=0;

        for(int i=n-2;i>=0;i--){
            table[i] = Integer.MAX_VALUE;
            for(int j = i+1; j < n && j <= i+arr[i]; j++){
                table[i] = Math.min(table[i], table[j]+1);
            }
        }
        return table[0];
    }
    */
}
