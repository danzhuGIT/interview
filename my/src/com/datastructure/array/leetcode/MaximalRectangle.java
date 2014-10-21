package com.datastructure.array.leetcode;

/**
 * Created by danzhu on 10/1/14.
 *
 * Maximal Rectangle
 *
 * Given a 2D binary matrix filled with 0's and 1's,
 * find the largest rectangle containing all ones and return its area.
 */

//Amortized time is O(mn)
//if adjacent bar is higher or equal to current bar, it could reach as least same far as his.

public class MaximalRectangle {
    public int maximalRectangle(char[][] matrix) {
        int max = 0;
        if(matrix == null || matrix.length < 1 || matrix[0].length < 1)
            return max;
        int colNum = matrix[0].length;
        int[] ones = new int[colNum];
        int[] left = new int[colNum];
        int[] right = new int[colNum];
        for(int curRow = 0; curRow < matrix.length; curRow++){
            for(int i = 0; i < colNum; i++){
                if(matrix[curRow][i]=='1')
                    ones[i] = ones[i]+1;
                else
                    ones[i] = 0;
            }
            for(int i = 0; i < colNum; i++){
                int leftBound = i-1;
                while(leftBound>=0 && ones[leftBound]>=ones[i])
                    leftBound = left[leftBound]-1;
                left[i]=leftBound+1;
            }
            for(int i = colNum-1; i >= 0; i--){
                int rightBound = i+1;
                while(rightBound < colNum && ones[rightBound]>=ones[i])
                    rightBound = right[rightBound]+1;
                right[i]=rightBound-1;
            }
            for(int i = 0; i < colNum; i++){
                max = Math.max(max, (right[i]-left[i]+1) * ones[i]);
            }
        }
        return max;
    }
}
