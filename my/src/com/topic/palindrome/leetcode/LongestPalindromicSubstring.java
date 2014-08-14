package com.topic.palindrome.leetcode;

/**
 * Created by danzhu on 7/4/14.
 *
 * Given a string S, find the longest palindromic substring in S.
 * You may assume that the maximum length of S is 1000, and there exists one unique longest palindromic substring.
 *
 */

public class LongestPalindromicSubstring {
    public static void main(String[] args){
        //System.out.print(longestPalindrome("ccc"));
    }

    public String longestPalindrome(String s) {

        if(s == null || s.length() ==0)   return null;
        if(s.length() == 1) return s;

        int length = s.length();
        int max = 1;
        int start = 0;
        int end = 0;

        boolean[][] table = new boolean[length][length];

        for(int j = 0; j < length ; j++){
            for(int i = j; i >= 0; i--){
                if(j == i){
                    table[i][j] = true;
                } else {
                    if(j-i ==1) {
                        table[i][j] = s.charAt(i) == s.charAt(j) ? true : false;
                    } else {
                        if(s.charAt(i)==s.charAt(j) && table[i+1][j-1] == true)
                            table[i][j] = true;
                    }
                    if(table[i][j] && max < j-i+1){
                        start = i;
                        end = j;
                        max = j-i+1;
                    }
                }
            }

        }
        return s.substring(start,end+1);
    }
}
