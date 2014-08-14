package com.datastructure.array.leetcode;

/**
 * Created by danzhu on 7/10/14.
 *
 * Given an unsorted integer array, find the first missing positive integer.

 For example,
 Given [1,2,0] return 3,
 and [3,4,-1,1] return 2.

 Your algorithm should run in O(n) time and uses constant space.
 *
 */
public class FirstMissingPositive {

    public int firstMissingPositive(int[] array){
        for(int i=0;i<array.length;i++){
            while(!(array[i]==i+1)){
                if(array[i]<=0 || array[i]>=array.length || array[i]==array[array[i]-1])
                    break;
                swap(array,i,array[i]-1);
            }
        }
        for(int i=0;i<array.length;i++){
            if(!(array[i]==i+1))
                return i+1;
        }
        return array.length+1;

    }
    public void swap(int[] array, int i,int j){
        int tmp=array[i];
        array[i]=array[j];
        array[j]=tmp;
    }

}
