package com.topic.search.leetcode;

/**
 * Created by danzhu on 7/10/14.
 *
 * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

 Integers in each row are sorted from left to right.
 The first integer of each row is greater than the last integer of the previous row.
 For example,

 Consider the following matrix:

 [
 [1,   3,  5,  7],
 [10, 11, 16, 20],
 [23, 30, 34, 50]
 ]
 Given target = 3, return true.
 *
 */
public class Search2DMatrix {
    /*
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length== 0) return false;
        if(matrix[0].length == 0) return false;

        int row = matrix.length-1;
        int col = 0;
        while(row>=0 && col<matrix[0].length){
            if(matrix[row][col] == target){
                return true;
            }else if(matrix[row][col] > target){
                row = row-1;
            } else {
                col=col+1;
            }
        }

        return false;
    }
     */

    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        if(row == 0) return false;
        int col = matrix[0].length;
        if(col == 0) return false;

        if(target < matrix[0][0])   return false;

        int start = 0;
        int end = row - 1;

        while(start <= end){
            int mid = (start + end) / 2;
            if(matrix[mid][0] > target){
                end = mid - 1;
            } else if (matrix[mid][0] == target){
                return true;
            } else {
                start = mid+1;
            }
        }

        int targetRow = end;
        start = 0;
        end = col - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(matrix[targetRow][mid] > target){
                end = mid - 1;
            } else if (matrix[targetRow][mid] == target){
                return true;
            } else {
                start = mid+1;
            }
        }
        return false;
    }
}
