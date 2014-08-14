package com.algorithm.recursion.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by danzhu on 7/19/14.
 *
 * The n-queens puzzle is the problem of placing n queens on an n×n chessboard such that no two queens attack each other.



 Given an integer n, return all distinct solutions to the n-queens puzzle.

 Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space respectively.

 For example,
 There exist two distinct solutions to the 4-queens puzzle:

 [
 [".Q..",  // Solution 1
 "...Q",
 "Q...",
 "..Q."],

 ["..Q.",  // Solution 2
 "Q...",
 "...Q",
 ".Q.."]
 ]
 *
 */
public class NQueens {
    public List<String[]> solveNQueens(int n) {
        List<String[]> result = new ArrayList<String[]>();
        int[] columnForRow = new int[n];
        placeQueen(columnForRow, 0, result);
        return result;
    }

    private void placeQueen(int[] columnForRow, int row, List<String[]> result){
        int n = columnForRow.length;
        if(row == n){
            printNQueens(columnForRow, result);
            return;
        }else{
            for(int i = 0; i < n; i++){
                columnForRow[row] = i;
                if(isValid(columnForRow, row))
                    placeQueen(columnForRow, row+1, result);
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

    private void printNQueens(int[] columnForRow, List<String[]> result){
        int n = columnForRow.length;
        String[] sol = new String[n];
        for(int i = 0; i < n; i++){
            String line = "";
            for(int j = 0; j < n; j++){
                if(columnForRow[i] == j)
                    line += "Q";
                else
                    line +=".";
            }
            sol[i] = line;
        }
        result.add(sol);
    }
}
