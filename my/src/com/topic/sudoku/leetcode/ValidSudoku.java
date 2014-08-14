package com.topic.sudoku.leetcode;

/**
 * Created by danzhu on 7/17/14.
 * Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.

 The Sudoku board could be partially filled, where empty cells are filled with the character '.'.


 A partially filled sudoku which is valid.

 Note:
 A valid Sudoku board (partially filled) is not necessarily solvable. Only the filled cells need to be validated.
 */
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++){
            int[] row = new int[9];
            int[] col = new int[9];
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.'){
                    if(row[board[i][j]-49] > 0)
                        return false;
                    row[board[i][j]-49]++;
                }
                if(board[j][i] != '.'){
                    if(col[board[j][i]-49] > 0)
                        return false;
                    col[board[j][i]-49]++;
                }
            }
        }
        for(int i = 0; i < 9; i+=3){
            for(int j = 0; j < 9; j+=3){
                int[] block = new int[9];
                for(int m = 0; m < 3; m++){
                    for(int n = 0; n < 3; n++){
                        if(board[i+m][j+n] != '.'){
                            if(block[board[i+m][j+n]-49] > 0)
                                return false;
                            block[board[i+m][j+n]-49]++;
                        }
                    }
                }
            }
        }
        return true;
    }
}
