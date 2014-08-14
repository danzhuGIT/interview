package com.algorithm.DP.leetcode;

/**
 * Created by danzhu on 7/11/14.
 * Follow up for "Unique Paths":

 Now consider if some obstacles are added to the grids. How many unique paths would there be?

 An obstacle and empty space is marked as 1 and 0 respectively in the grid.

 For example,
 There is one obstacle in the middle of a 3x3 grid as illustrated below.

 [
 [0,0,0],
 [0,1,0],
 [0,0,0]
 ]
 The total number of unique paths is 2.
 */
//copy
public class UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int[][] table=new int[m][n];

        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++){
                if(i==0 && j==0){
                    if(obstacleGrid[i][j]==1)
                        return 0;
                    else
                        table[i][j]=1;
                }
                else if(obstacleGrid[i][j]==0){
                    if(i==0){
                        if(obstacleGrid[i][j-1]==0)
                            table[i][j]+=table[i][j-1];
                    }
                    else if(j==0){
                        if(obstacleGrid[i-1][j]==0)
                            table[i][j]+=table[i-1][j];
                    }
                    else{
                        if(obstacleGrid[i-1][j]==0)
                            table[i][j]+=table[i-1][j];
                        if(obstacleGrid[i][j-1]==0)
                            table[i][j]+=table[i][j-1];
                    }
                }
            }
        return table[m-1][n-1];
    }

}
