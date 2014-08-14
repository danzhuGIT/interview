package com.datastructure.string.leetcode;

/**
 * Created by danzhu on 7/17/14.
 * Given s1, s2, s3, find whether s3 is formed by the interleaving of s1 and s2.

 For example,
 Given:
 s1 = "aabcc",
 s2 = "dbbca",

 When s3 = "aadbbcbcac", return true.
 When s3 = "aadbbbaccc", return false.
 */
public class InterleavingString {
    public boolean isInterleave(String s1, String s2, String s3) {
        int l1 = s1.length();
        int l2 = s2.length();
        if(s3.length() != (l1 + l2))
            return false;

        boolean[][] table = new boolean[l1+1][l2+1];
        for(int i = 0; i <= l1; i++){
            for(int j = 0; j <= l2; j++){
                if(i == 0 && j == 0){
                    table[i][j] = true;
                } else if(i == 0){
                    table[i][j] = s2.charAt(j-1) == s3.charAt(j-1) && table[i][j-1];
                } else if(j == 0){
                    table[i][j] = s1.charAt(i-1) == s3.charAt(i-1) && table[i-1][j];
                } else {
                    table[i][j] = (s1.charAt(i-1) == s3.charAt(i+j-1) && table[i-1][j]) || (s2.charAt(j-1) == s3.charAt(i+j-1) && table[i][j-1]);
                }
            }
        }
        return table[l1][l2];
    }
}
