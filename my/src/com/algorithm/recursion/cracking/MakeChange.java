package com.algorithm.recursion.cracking;

/**
 * Created by danzhu on 8/4/14.
 * Given an infinite number of quarters (25 cents), dimes (10 cents), nickels (5 cents) and pennies (1 cent),
 * write code to calculate the number of ways of representing n cents.
 */
public class MakeChange {
    static int[] denoms = {25, 10, 5, 1};

    public static void main(String[] args){
        System.out.print(makeChange(20, 0));
    }

    public static int makeChange(int n, int index){
        if(denoms[index] == 1)
            return 1;

        int way = 0;
        for(int i = 0; n - denoms[index] * i >= 0; i++){
            way += makeChange(n - denoms[index] * i, index + 1);
        }
        return way;
    }
}
