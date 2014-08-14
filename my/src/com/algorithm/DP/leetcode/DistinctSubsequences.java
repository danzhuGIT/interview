package com.algorithm.DP.leetcode;

/**
 * Created by danzhu on 7/23/14.
 *
 * Given a string S and a string T, count the number of distinct subsequences of T in S.

 A subsequence of a string is a new string which is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (ie, "ACE" is a subsequence of "ABCDE" while "AEC" is not).

 Here is an example:
 S = "rabbbit", T = "rabbit"

 Return 3.
 *
 */
public class DistinctSubsequences {
    public int numDistinct(String S, String T) {
        int[][] table = new int[T.length()+1][S.length()+1];
        table[0][0] = 1;

        for(int i = 1; i < table.length; i++){
            table[i][0] = 0;
        }

        for(int j = 1; j < table[0].length; j++){
            table[0][j] = 1;
        }

        for(int i = 1; i < table.length; i++){
            for(int j = 1; j < table[0].length; j++){
                if(T.charAt(i-1) != S.charAt(j-1))
                    table[i][j] = table[i][j-1];
                else{
                    table[i][j] = table[i-1][j-1]+table[i][j-1];
                }
            }
        }
        return table[T.length()][S.length()];
    }
}
