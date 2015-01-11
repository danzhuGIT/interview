package com.topic.math.leetcode;

/**
 Given an integer n, return the number of trailing zeroes in n!.
 
 Note: Your solution should be in logarithmic time complexity.
 */
public class FactorialTrailZeros {
    public int trailingZeroes(int n) {
        int result = 0;
        while (n/5 >= 1) {
            result += n/5;
            n = n/5;
        }
        return result;
    }
    /*
     public int trailingZeroes(int n) {
     int result = 0;
     //int i will overflow and result in Time Limit Exceeded
     for(long i = 5; i <= n; i *= 5)
     result += n/i;
     
     return result;
     }
     */
}
