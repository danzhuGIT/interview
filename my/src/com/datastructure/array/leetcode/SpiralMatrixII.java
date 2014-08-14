package com.datastructure.array.leetcode;

/**
 * Created by danzhu on 7/10/14.
 *
 * Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.

 For example,
 Given n = 3,

 You should return the following matrix:
 [
 [ 1, 2, 3 ],
 [ 8, 9, 4 ],
 [ 7, 6, 5 ]
 ]
 *
 */
public class SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        generateMatrixHelper(result, 0, n-1, 1);
        return result;
    }
    public void generateMatrixHelper(int[][] matrix, int start, int end, int num){
        if(end < start) return;

        for(int i = start; i <= end; i++){
            matrix[start][i] = num++;
        }
        for(int i = start + 1; i <= end; i++){
            matrix[i][end] = num++;
        }
        if(start < end){
            for(int i = end - 1; i >= start; i--){
                matrix[end][i] = num++;
            }
            for(int i = end - 1; i > start; i--){
                matrix[i][start] = num++;
            }
        }
        generateMatrixHelper(matrix, start+1, end-1, num);
    }

}
