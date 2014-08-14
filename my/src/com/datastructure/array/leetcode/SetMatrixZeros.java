package com.datastructure.array.leetcode;

/**
 * Created by danzhu on 7/4/14.
 *
 * Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in place.
 * Follow up:
 * Did you use extra space?
 * A straight forward solution using O(mn) space is probably a bad idea.
 * A simple improvement uses O(m + n) space, but still not the best solution.
 * Could you devise a constant space solution?
 */

public class SetMatrixZeros {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        if(row == 0) return;
        int col = matrix[0].length;
        if(col == 0) return;

        boolean fr0 = false;
        boolean fc0 = false;

        for(int i = 0; i < col; i++){
            if(matrix[0][i] == 0) fr0 = true;
        }
        for(int i = 0; i < row; i++){
            if(matrix[i][0] == 0) fc0 = true;
        }

        for(int i = 1; i < row; i++){
            for(int j = 1; j < col; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for(int i = 1; i < row; i++){
            for(int j = 1; j < col; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        if(fr0){
            for(int i = 0; i < col; i++){
                matrix[0][i] = 0;
            }
        }

        if(fc0){
            for(int i = 0; i < row; i++){
                matrix[i][0] = 0;
            }
        }
    }
}
