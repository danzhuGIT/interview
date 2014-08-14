package com.datastructure.array.leetcode;

/**
 * Created by danzhu on 6/30/14.
 */
public class SingleNumberII {
    public int singleNumber(int[] A) {
        int result = 0;
        int[] count = new int[32];

        for(int i = 0; i < 32; i++){
            for(int j = 0; j < A.length; j++){
                count[i] += (A[j] >> i) & 1;
            }
            result += ((count[i] % 3) << i);
        }
        return result;
    }
}
