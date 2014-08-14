package com.algorithm.DP.leetcode;

/**
 * Created by danzhu on 7/28/14.
 * A message containing letters from A-Z is being encoded to numbers using the following mapping:

 'A' -> 1
 'B' -> 2
 ...
 'Z' -> 26
 Given an encoded message containing digits, determine the total number of ways to decode it.

 For example,
 Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).

 The number of ways decoding "12" is 2.
 */
public class DecodedWays {
    public int numDecodings(String s) {
        int[] table = new int[s.length()+1];
        if(s.equals("") || s.charAt(0) == '0')
            return 0;

        table[0] = 1;
        table[1] = 1;
        for(int i = 2; i-1 < s.length(); i++){
            int j = i-1;
            if(s.charAt(j)=='0'){
                if(s.charAt(j-1)!='1' && s.charAt(j-1)!='2')
                    return 0;
                else
                    table[i] = table[i-2];
            }else {
                if(s.charAt(j-1) == '1'){
                    table[i] += table[i-2];
                } else if(s.charAt(j-1) == '2' && s.charAt(j) >= '0' && s.charAt(j) <= '6'){
                    table[i] += table[i-2];
                }
                table[i] += table[i-1];
            }
        }
        return table[s.length()];
    }
}
