package com.datastructure.array.haitao;

/**
 * Created by danzhu on 8/12/14.
 * 题目：输入一个整数数组，调整数组中数字的顺序，
 * 使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。要求时间复杂度为O(n)。
 */

//i is odd, j is even, i++, j--
//i is odd, j is odd, i++
//i is even, j is even, j--
//i is even, j is odd, swap i,j, i++, j--

public class ReorderOddEven {
    public static void main(String[] args){
        int[] array={1,2,3,4,5};
        reorderOddEven(array);
        for(int i=0;i<array.length;i++)
            System.out.print(array[i]+" ");
    }

    public static void reorderOddEven(int[] array){
        int i = 0;
        int j = array.length - 1;

        while(i < j){
            if(!isEven(array[i])){
                i++;
                continue;
            }
            if(isEven(array[j])){
                j--;
                continue;
            }
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }

    static boolean isEven(int n){
        return (n & 1) == 0;
    }
}
