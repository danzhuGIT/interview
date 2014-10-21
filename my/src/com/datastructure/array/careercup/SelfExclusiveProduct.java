package com.datastructure.array.careercup;

/**
 * Created by danzhu on 8/28/14.
 * /**
 * Implement a method which takes an integer array and returns an integer array (of equal size) in
 * which each element is the product of every number in the input array with the exception of the
 * number at that index.
 *
 * Example:
 *   [3, 1, 4, 2] => [8, 24, 6, 12]
 */

public class SelfExclusiveProduct {
    public static void main(String[] args){
        int[] array={3,1,4,2};
        int[] result = selfExclusiveProduct(array);
        for(int i : result){
            System.out.print(i+" ");
        }
    }
    public static int[] selfExclusiveProduct(int[] array){
        int[] result = new int[array.length];
        int[] front = new int[array.length];
        int[] rear = new int[array.length];

        front[0] = 1;
        rear[array.length-1] = 1;
        for(int i = 1; i < front.length; i++){
            front[i] = front[i-1]*array[i-1];
        }
        for(int i = rear.length-2; i >= 0; i--){
            rear[i] = rear[i+1]*array[i+1];
        }

        for(int i = 0; i < array.length; i++){
            result[i] = front[i] * rear[i];
        }
        return result;
    }
}

