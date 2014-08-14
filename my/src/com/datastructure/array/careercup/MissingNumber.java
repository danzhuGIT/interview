package com.datastructure.array.careercup;

/**
 * Created by danzhu on 8/1/14.
 * You have n - 1 numbers from 1 to n. Your task is to find the missing number.

 I.e.
 n = 5
 v = [4, 2, 5, 1]
 The result is 3.
 */

// exclucive OR the array

public class MissingNumber {
    public static void main(String[] args){
        int[] array = {2,4,5,3,7};
        System.out.print(missingNumber(array));
    }

    public static int missingNumber(int[] array){
        int x = 0;
        int y = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i : array){
            x ^= i;
            min = Math.min(min, i);
            max = Math.max(max, i);
        }

        int i = min;
        while(i <= max){
            y ^= i;
            i++;
        }
        return x^y;
    }
}
