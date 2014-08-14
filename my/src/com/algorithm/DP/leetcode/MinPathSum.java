package com.algorithm.DP.leetcode;

/**
 * Created by danzhu on 7/13/14.
 *
 * Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.

 Note: You can only move either down or right at any point in time.
 *
 */
public class MinPathSum {
    public int minPathSum(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[][] table = new int[row][col];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(i == 0 && j == 0){
                    table[i][j] = grid[i][j];
                } else if(i == 0){
                    table[i][j] = table[i][j-1] + grid[i][j];
                } else if(j == 0){
                    table[i][j] = table[i-1][j] + grid[i][j];
                } else {
                    table[i][j] = Math.min(table[i-1][j], table[i][j-1]) + grid[i][j];
                }
            }
        }
        return table[row-1][col-1];
    }
}
