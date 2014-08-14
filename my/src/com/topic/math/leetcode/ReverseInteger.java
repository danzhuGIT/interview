package com.topic.math.leetcode;

/**
 * Created by danzhu on 7/7/14.
 *
 * Reverse digits of an integer.

 Example1: x = 123, return 321
 Example2: x = -123, return -321
 *
 */
public class ReverseInteger {
    public int reverse(int x) {
        boolean isNegative = false;
        if(x < 0) {
            isNegative = true;
            x = 0 - x;
        }

        int result = 0;
        while(x != 0){
            result = result * 10 + x % 10;
            x = x / 10;
        }

        if(isNegative) result = 0 - result;
        return result;
    }
}
