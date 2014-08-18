package com.topic.Nsum.haitao;

/**
 * Created by danzhu on 8/14/14.
 * 题目：在数组中，数字减去它右边的数字得到一个数对之差。
 * 求所有数对之差的最大值。例如在数组{2, 4, 1, 16, 7, 5, 11, 9}中，数对之差的最大值是11，是16减去5的结果。
 */
public class FindGreatestDiff {
    public static void main(String[] args){
        int[] array = {2,4,1,16,7,5,11,9};
        System.out.print(greatestDiff(array));
    }

    public static int greatestDiff(int[] array){
        int maxDiff = Integer.MIN_VALUE;
        int min = array[array.length-1];

        for(int i = array.length-2; i>=0; i--){
            maxDiff = Math.max(maxDiff, array[i]-min);
            min = Math.min(min, array[i]);

        }
        return maxDiff;
    }
}
