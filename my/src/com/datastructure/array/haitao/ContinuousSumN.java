package com.datastructure.array.haitao;

import java.util.ArrayList;

/**
 * Created by danzhu on 8/17/14.
 * 题目：输入一个正数n，输出所有和为n连续正数序列。

 例如输入15，由于1+2+3+4+5=4+5+6=7+8=15，所以输出3个连续序列1-5、4-6和7-8。
 */
public class ContinuousSumN {
    public static void main(String[] args){
        continuousSumN(15);
    }
    public static void continuousSumN(int n){
        int start = 1;
        int end = 2;
        int sum = start+end;
        while(start <= n/2){
            if(sum == n)
                print(start, end);

            while(sum > n){
                sum -= start;
                start++;

                if(sum == n)
                    print(start, end);
            }

            end++;
            sum += end;
        }
    }

    private static void print(int start, int end){
        for(int i = start; i <= end; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
