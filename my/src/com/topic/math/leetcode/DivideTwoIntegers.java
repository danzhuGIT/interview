package com.topic.math.leetcode;

/**
 * Created by danzhu on 10/29/14.
 */
public class DivideTwoIntegers {
    public static void main(String[] args){
        System.out.print(-1<<1);
        int dividend = -1;
        int divisor = 1;
        System.out.print(divideII(dividend, divisor));
    }

    public static int divideII(int dividend, int divisor) {
        long dividendLong = Math.abs((long)dividend);
        long divisorLong = Math.abs((long)divisor);

        boolean isNeg = false;
        if(dividend < 0){
            isNeg = !isNeg;
        }
        if(divisor < 0){
            isNeg = !isNeg;
        }

        int result = 0;
        long count = 1;

        while(divisorLong < dividendLong){
            divisorLong <<= 1;
            count <<= 1;
        }

        while(dividendLong >= Math.abs((long)divisor) ){
            if(dividendLong>=divisorLong){
                result += count;
                dividendLong -= divisorLong;
            }
            divisorLong >>= 1;
            count >>=1;
        }

        if(isNeg)
            result = -result;
        return result;
    }

    //Time Limit Exceeded
    //2147483647 , 1
    public int divide(int dividend, int divisor) {
        boolean isNeg = false;
        if(dividend < 0){
            dividend = -dividend;
            isNeg = !isNeg;
        }
        if(divisor < 0){
            divisor = -divisor;
            isNeg = !isNeg;
        }

        int result = 0;
        while(dividend >= divisor){
            dividend -= divisor;
            result++;
        }
        if(isNeg)
            result = -result;
        return result;
    }

}
