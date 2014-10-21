package com.topic.math.haitao;

/**
 * Created by danzhu on 9/12/14.
 * 题目：输入数字n，按顺序输出从1最大的n位10进制数。
 * 比如输入3，则输出1、2、3一直到最大的3位数即999。
 *
 * permutation fo each digit
 */
public class PrintMaxDigit {
    public static void main(String[] args){
        printMaxDigit(new char[2],0);
    }
    public static void printMaxDigit(char[] num, int index){
        if(index == num.length) {
            printNum(num);
            return;
        }

        for(int i = 0; i <= 9; i++){
            num[index] = (char)(i+'0');
            printMaxDigit(num, index+1);
        }

    }
    public static void printNum(char[] num){
        int index = 0;
        while(index < num.length && num[index]=='0')
            index++;

        if(index < num.length){
            for(int i = index; i < num.length; i++){
                System.out.print(num[i]);
            }
            System.out.print(" ");
        }

    }
}
