package com.algorithm.DFS.leetcode;

import java.util.ArrayList;

/**
 * Created by danzhu on 7/17/14.
 *
 * Write a program to solve a Sudoku puzzle by filling the empty cells.

 Empty cells are indicated by the character '.'.

 You may assume that there will be only one unique solution.
 *
 */
public class SudokuSolver {
    //time limit exceeded
    /*
    public void solveSudoku(char[][] board) {
        if (board==null||board.length==0){
            return;
        }
        solved(board);
    }

    private boolean solved(char[][] board){
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j]=='.'){
                    for(char c = '1'; c <= '9'; c++){
                        if(isValid(board, i, j, c)){
                            board[i][j] = c;
                            if(solved(board))
                                return true;
                            else
                                board[i][j] = '.';
                        }
                    }
                }
            }
        }
        return false;
    }

    private boolean isValid(char[][] board, int i, int j, char c){
        // check column
        for (int row=0; row<9; row++){
            if (board[row][j]==c){
                return false;
            }
        }

        // check row
        for (int col=0; col<9; col++){
            if (board[i][col]==c){
                return false;
            }
        }

        // check block
        for(int row=i/3*3; row<i/3*3+3; row++){
            for (int col=j/3*3; col<j/3*3+3; col++){
                if (board[row][col]==c){
                    return false;
                }
            }
        }

        return true;
    }*/

    //copy
    public void solveSudoku(char[][] board) {
        ArrayList<Integer> empty = new ArrayList<Integer>();
        for(int i=0;i<9;i++)
            for(int j=0;j<9;j++)
                if(board[i][j]=='.'){
                    empty.add(i*9+j);
                }
        int len = empty.size();
        dfs(empty,board,0,len);
    }

    public boolean dfs(ArrayList<Integer> empty, char[][] board, int cur, int len){
        if(cur==len) return true;
        int index = empty.get(cur);
        int row = index/9;
        int col = index%9;
        for(int v=1;v<=9;v++){
            if(isValid(v,row,col,board)){
                board[row][col] = (char)(v+'0');
                if(dfs(empty,board,cur+1,len))
                    return true;
                board[row][col] = '.';
            }
        }
        return false;
    }

    public boolean isValid(int v, int row, int col, char[][] board){
        for(int i=0;i<9;i++){
            if(board[row][i] - '0'==v) return false;
            if(board[i][col] - '0'==v) return false;
            int row_s = 3*(row/3) + i/3;
            int col_s = 3*(col/3) + i%3;
            if(board[row_s][col_s] - '0'==v) return false;
        }
        return true;
    }
}
