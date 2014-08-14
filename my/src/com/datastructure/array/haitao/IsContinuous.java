package com.datastructure.array.haitao;

import java.util.Arrays;

/**
 * Created by danzhu on 8/12/14.
 * 从扑克牌中随机抽5张牌，判断是不是一个顺子，即这5张牌是不是连续的。2-10为数字本身，A为1，J为11，Q为12，K为13，而大小王可以看成任意数字。
 *
 */
public class IsContinuous {
    public static void main(String[] args){
        int[] num = {0,6,1,0,0};
        System.out.print(isContinuous(num));

    }
    //treat Joker as zero
    //sort the list
    //count gaps and zeros then check if they are equal
    public static boolean isContinuous(int[] array){
        if(array == null || array.length != 5)
            return false;

        Arrays.sort(array);

        int zeros = 0;
        int gaps = 0;

        for(int i = 0; i < 5 && array[i]==0; i++){
            zeros++;
        }

        int smaller = zeros;
        int bigger = smaller+1;
        while(bigger < 5){
            gaps += array[bigger]-array[smaller]-1;
            smaller++;
            bigger++;
        }

        return zeros >= gaps ? true : false;

    }

}
