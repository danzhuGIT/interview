package com.datastructure.array.haitao;

/**
 * Created by danzhu on 8/6/14.
 * 输入一个整形数组，数组里有正数也有负数。数组中连续的一个或多个整数组成一个子数组，每个子数组都有一个和。求所有子数组的和的最大值。要求时间复杂度为O(n)。

 例如输入的数组为1, -2, 3, 10, -4, 7, 2, -5，和最大的子数组为3, 10, -4, 7, 2，因此输出为该子数组的和18。
 */
public class MaximumSumSubarray {
    public static void main(String[] args){
        int[] array = {0,-1,3,-1,4};
        int[] array2 = {-2,-1,-1};
        int[] array3 = {1,3,-2,0};
        System.out.println(maximumSumSubarray(array));
        System.out.println(maximumSumSubarray(array2));
        System.out.println(maximumSumSubarray(array3));

    }
    //if accumulated sum is bigger than zero, add it with current element and update max
    public static int maximumSumSubarray(int[] array){
        if(array == null || array.length == 0)
            return Integer.MIN_VALUE;

        int max = array[0];
        int maxEndHere = array[0];
        for(int i = 1; i < array.length; i++){
            if(maxEndHere >= 0){
                maxEndHere += array[i];
            } else {
                maxEndHere = array[i];
            }
            max = Math.max(maxEndHere, max);
        }
        return max;
    }
}
