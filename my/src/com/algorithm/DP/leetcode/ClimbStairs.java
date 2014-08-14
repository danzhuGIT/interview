package com.algorithm.DP.leetcode;

/**
 * Created by danzhu on 7/11/14.
 *
 *
 * You are climbing a stair case. It takes n steps to reach to the top.

 Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

 */
public class ClimbStairs {
    //f(n) = f(n-1) + f(n-2);
    public int climbStairs(int n) {
        int f1 = 1;
        int f2 = 2;
        int result = 0;
        if(n==1)    return f1;
        if(n==2)    return f2;
        for(int i = 3; i<=n; i++){
            result = f1 + f2;
            f1 = f2;
            f2 = result;
        }
        return result;
    }

}
