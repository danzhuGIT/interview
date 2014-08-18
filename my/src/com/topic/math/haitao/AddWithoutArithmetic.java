package com.topic.math.haitao;

/**
 * Created by danzhu on 8/14/14.
 * 题目：写一个函数，求两个整数的之和，要求在函数体内不得使用＋、－、×、÷。
 */
public class AddWithoutArithmetic {
    public static void main(String[] args){
        System.out.print(addWithoutArithmetic(2,8));
    }

    public static int addWithoutArithmetic(int n1, int n2){
        if(n2 == 0)
            return n1;
        int sum = n1 ^ n2;
        int carry = (n1 & n2) << 1;
        return addWithoutArithmetic(sum, carry);
    }
}
