package com.topic.math.leetcode;

/**
 * Created by danzhu on 9/12/14.
 * Implement int sqrt(int x).

 Compute and return the square root of x.
 */
public class Sqrt {
    public int sqrt(int x) {
        int start = 0;
        int end = x;

        while(start<end){
            int mid = (start + end)/2;
            long temp = (long)mid * (long)mid;
            if(temp == x)
                return mid;
            else if(temp<x)
                start = mid+1;
            else
                end = mid-1;
        }
        //while loop unsatisfy at start=end
        if(start*start > x)
            return start-1;
        return start;
    }
}
