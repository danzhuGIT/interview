package com.datastructure.array.haitao;

/**
 * Created by danzhu on 8/12/14.
 */
public class TwoNumsAppearOnce {
    public static void main(String[] args){
        int[] array={1,2,3,5,3,2,4,1};
        int[] result = twoNumsAppearOnce(array);
        System.out.print(result[0]+" "+result[1]);
    }
    public static int[] twoNumsAppearOnce(int[] array){
        if(array == null || array.length < 2)
            return null;

        int[] result = new int[2];
        int xor = 0;
        for(int i: array){
            xor ^= i;
        }

        int pilot = firstBitEqualsOne(xor);

        for(int i : array){
            if((i & pilot) != 0){
                result[0] ^= i;
            } else {
                result[1] ^= i;
            }
        }
        return result;

    }

    static int firstBitEqualsOne(int n){
        int result = 1;
        while( (n & result) == 0){
            result <<= 1;
        }
        return result;
    }
}
