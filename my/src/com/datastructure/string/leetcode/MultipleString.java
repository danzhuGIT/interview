package com.datastructure.string.leetcode;

/**
 * Created by danzhu on 7/4/14.
 *
 * Given two numbers represented as strings, return multiplication of the numbers as a string.
 *
 * Note: The numbers can be arbitrarily large and are non-negative.
 */
public class MultipleString {
    public static void main(String[] args){
        String num1 = "9";
        String num2 = "99";
        System.out.print(multiply(num1,num2));
    }
    public static String multiply(String num1, String num2) {
        //revers origin string
        num1 = new StringBuilder(num1).reverse().toString();
        num2 = new StringBuilder(num2).reverse().toString();
        int sum[] = new int[num1.length()+num2.length()];
        for(int i = 0; i < num1.length(); i++){
            int m1 = num1.charAt(i) - '0';
            for(int j = 0; j < num2.length(); j++){
                int m2 = num2.charAt(j) - '0';
                sum[i + j] += m1 * m2;  // index is i + j
            }
        }

        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for(int i = 0; i < sum.length; i++){
            int digit = (sum[i] + carry) % 10;
            carry = (sum[i] + carry) / 10;
            sb.insert(0,digit);
        }

        while(sb.length() > 0 && sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }

        return sb.length() == 0? "0" : sb.toString();
    }
}

