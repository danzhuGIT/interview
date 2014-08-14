package com.algorithm.recursion.leetcode;

/**
 * Created by danzhu on 7/19/14.
 *
 * Follow up for N-Queens problem.

 Now, instead outputting board configurations, return the total number of distinct solutions.

 *
 */
public class NQueensII {
    int count;

    public int totalNQueens(int n) {
        int[] columnForRow = new int[n];
        placeQueen(columnForRow, 0);
        return count;
    }

    private void placeQueen(int[] columnForRow, int row){
        int n = columnForRow.length;
        if(row == n){
            count++;
            return;
        }else{
            for(int i = 0; i < n; i++){
                columnForRow[row] = i;
                if(isValid(columnForRow, row))
                    placeQueen(columnForRow, row+1);
            }
        }
    }

    private boolean isValid(int[] columnForRow, int row){
        for(int i = 0; i < row; i++){
            int diff = Math.abs(columnForRow[row] - columnForRow[i]);
            if(diff == 0 || diff == row - i) return false;
        }
        return true;
    }
}
