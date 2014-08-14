package com.datastructure.array.careercup;

/**
 * Created by danzhu on 8/5/14.
 * Given an array that contains both positive and negative integers,
 * find the product of the maximum product subarray.
 *
 * Expected Time complexity is O(n) and only O(1) extra space can be used.
 */

/* Returns the product of max product subarray.  Assumes that the
   given array always has a subarray with product more than 1 */

public class MaximumProductSubarray {
    public static void main(String[] args){
        int[] array = {0,-1};
        int[] array2 = {2,0,-2};
        int[] array3 = {2,-3,-5,3,0};
        System.out.println(maxProduct(array));
        System.out.println(maxProduct(array2));
        System.out.println(maxProduct(array3));

    }
    public static int maxProduct(int[] array){
        int max = array[0];
        int maxPositive = 1;
        int minNegative = 1;
        for(int i = 0; i < array.length; i++){
            if(array[i] == 0){
                max = Math.max(max, 0);
                maxPositive = 1;
                minNegative = 1;
            } else {
                if (array[i] > 0) {
                    maxPositive = maxPositive * array[i];
                    minNegative = Math.min(minNegative * array[i], 1);
                } else {
                    int temp = maxPositive;
                    maxPositive = Math.max(minNegative * array[i], 1);
                    minNegative = temp * array[i];
                }
                max = Math.max(max, maxPositive);
            }
        }
        return max;
    }
}
