package com.topic.Nsum.careercup;

import java.util.Arrays;

/**
 * Created by danzhu on 8/1/14.
 * Given an integer 'k' and an sorted array A (can consist of both +ve/-ve nos), output 2 integers from A such that a-b=k.
 PS:
 nlogn solution would be to check for the occurence of k-a[i] (using binary search) when you encounter a[i]. methods like hash consume space.

 Is an O(n) solution with O(1) extraspace possible?
 */
public class TwoDiff {

    public static void main(String[] args){
        int[] array = {2,5,32,6,8};
        int[] result = twoDiff(array, -1);
        System.out.print(result);
    }


    public static int[] twoDiff(int[] array, int target){
        if(array == null || array.length < 2)
            return null;

        int[] result = new int[2];
        target = Math.abs(target);
        Arrays.sort(array);
        int i = 0;
        int j = 1;

        while(i<=j && j<array.length){
            if(array[j] - array[i] == target){
                result[0] = array[i];
                result[1] = array[j];
                break;
            } else if(array[j] - array[i] < target){
                j++;
            } else {
                i++;
            }

        }
        return result;
    }
}
