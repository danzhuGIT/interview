package com.algorithm.DP.leetcode;

/**
 * Created by danzhu on 7/17/14.
 *
 * Given two words word1 and word2, find the minimum number of steps required to convert word1 to word2. (each operation is counted as 1 step.)

 You have the following 3 operations permitted on a word:

 a) Insert a character
 b) Delete a character
 c) Replace a character
 *
 */
public class EditDistance {
    public int minDistance(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();
        int[][] table = new int[l1+1][l2+1];

        for(int i = 0; i <= l1; i++){
            for(int j = 0; j <= l2; j++){
                if(i == 0){
                    table[i][j] = j;
                } else if(j == 0){
                    table[i][j] = i;
                } else {
                    if(word1.charAt(i-1) == word2.charAt(j-1))
                        //table[i][j] = table[i-1][j-1];
                        table[i][j] = Math.min(table[i-1][j-1], Math.min(table[i-1][j]+1, table[i][j-1]+1));
                    else
                        //insert, replace, delete
                        table[i][j] = Math.min(Math.min(table[i][j-1], table[i-1][j-1]), table[i-1][j]) + 1;
                }
            }
        }
        return table[l1][l2];
    }
}
