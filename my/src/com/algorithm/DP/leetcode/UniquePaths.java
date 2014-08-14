package com.algorithm.DP.leetcode;

/**
 * Created by danzhu on 7/11/14.
 *
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

 The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

 How many possible unique paths are there?
 *
 */
public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] table = new int[m][n];
        for(int i = 0;i < m; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 || j == 0)
                    table[i][j]=1;
                else
                    table[i][j] = table[i-1][j]+table[i][j-1];
            }
        }
        return table[m-1][n-1];
    }
}
