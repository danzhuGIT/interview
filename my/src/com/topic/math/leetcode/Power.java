package com.topic.math.leetcode;

/**
 * Created by danzhu on 7/7/14.
 *
 * Implement pow(x, n).
 *
 */
public class Power {
    public double power(double x, int n) {
        if (n == 0)
            return 1;

        double v = power(x, n / 2);

        if (n % 2 == 0) {
            return v * v;
        } else {
            return v * v * x;
        }
    }

    public double pow(double x, int n) {
        if (n < 0) {
            return 1 / power(x, -n);
        } else {
            return power(x, n);
        }
    }

    //find nearest int log_a(c) result
    private int log(double c, int a){
        //Assume a is not equal to 0

        boolean isNeg = false;
        if(Math.abs(c) < Math.abs(a)){
            c = 1/c;
            isNeg = true;
        }

        int result = 0;

        while(Math.abs(c)>1){
            c /= a;
            result++;
        }
        if(isNeg){
            result = -result;
        }
        return result;
    }
}
