package com.topic.palindrome.leetcode;

/**
 * Created by danzhu on 7/4/14.
 *
 * Given a string s, partition s such that every substring of the partition is a palindrome.

 Return the minimum cuts needed for a palindrome partitioning of s.

 For example, given s = "aab",
 Return 1 since the palindrome partitioning ["aa","b"] could be produced using 1 cut.
 *
 */
public class PalindromePartitionII {
    public int minCut(String s) {
        if(s == null || s.length() == 0)    return 0;

        int length = s.length();
        int min = 0;
        boolean[][] table = new boolean[length][length];
        int[] cut = new int[length+1];
        cut[length] = -1;

        for(int i = 0; i<length; i++)
            cut[i] = length-i-1;

        for(int i = length-1; i>=0; i--){
            for(int j = i; j < length; j++){
                if(i == j)
                    table[i][j] = true;
                else if(j-i == 1)
                    table[i][j] = s.charAt(i) == s.charAt(j);
                else
                    table[i][j] = (s.charAt(i) == s.charAt(j) && table[i+1][j-1] == true);

                if(table[i][j])
                    cut[i] = Math.min(cut[i], cut[j+1]+1);
            }
        }
        return cut[0];
    }
}
