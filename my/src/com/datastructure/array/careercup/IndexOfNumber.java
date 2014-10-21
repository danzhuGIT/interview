package com.datastructure.array.careercup;

/**
 * Created by danzhu on 8/25/14.
 *
 * Given a sorted integer array and a number, find the start and end indexes of the number in the array.

 Ex1: Array = {0,0,2,3,3,3,3,4,7,7,9} and Number = 3 --> Output = {3,6}
 Ex2: Array = {0,0,2,3,3,3,3,4,7,7,9} and Number = 5 --> Output = {-1,-1}

 Complexity should be less than O(n)
 */

public class IndexOfNumber {
    public static void main(String[] args){
        int[] a = {0,0,2,3,3,3,3,4,7,7,9};
        int result[] = findIndex(a,3);
        System.out.println("{" + result[0] +"," + result[1] +"}");
        result = findIndex(a,5);
        System.out.println("{" + result[0] +"," + result[1] +"}");
    }

    //binary search
    public static int[] findIndex(int[] array, int target){
        int[] result = {-1, -1};
        int start = 0;
        int end = array.length;
        int middle;
        while(start <= end){
            middle = (start+end)/2;
            if(array[middle] == target){
                int left = middle-1;
                while(left>=0 && array[left]==target)
                    left--;
                int right = middle+1;
                while(right<array.length&&array[right] == target)
                    right++;
                result[0] = left+1;
                result[1] = right-1;
                return result;
            } else if(array[middle] < target){
                start = middle+1;
            } else {
                end = middle-1;
            }
        }
        return result;
    }
}
