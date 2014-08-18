package com.datastructure.array.haitao;

/**
 * Created by danzhu on 8/14/14.
 */
public class MinOfRotatedSortedArray {
    public static void main(String[] args){
        int[] array = {3,1,2,3};
        System.out.print(minOfRotatedSortedArray(array));

    }
    public static int minOfRotatedSortedArray(int[] array){
        int start = 0;
        int end = array.length-1;
        int mid = start;
        while(array[start] >= array[end]){
            if(end - start == 1){
                mid = end;
                break;
            }

            mid = (start+end)/2;
            if(array[mid] >= array[start])
                start = mid;
            else
                end = mid;

        }
        return array[mid];
    }
}
