package com.datastructure.array.leetcode;

/**
 * Created by danzhu on 7/10/14.
 *
 * Given a 2D board and a word, find if the word exists in the grid.

 The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.

 For example,
 Given board =

 [
 ["ABCE"],
 ["SFCS"],
 ["ADEE"]
 ]
 word = "ABCCED", -> returns true,
 word = "SEE", -> returns true,
 word = "ABCB", -> returns false.
 *
 */
public class WordSearch {
    public boolean exist(char[][] board, String word) {
        if (board.length == 0) {
            return word.length() == 0;
        }

        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(recursion(board, word, 0, i, j, visited))
                    return true;
            }
        }

        return false;
    }

    public boolean recursion(char[][] board, String word, int index, int row, int col, boolean[][] visited){
        if(board[row][col] != word.charAt(index))
            return false;

        if(index == word.length() - 1)
            return true;

        visited[row][col] = true;

        boolean up = false;
        if(row > 0 && !visited[row-1][col])
            up = recursion(board, word, index+1, row-1, col, visited);
        if(up)  return true;

        boolean down = false;
        if(row < board.length - 1 && !visited[row+1][col])
            down = recursion(board, word, index+1, row+1, col, visited);
        if(down)  return true;

        boolean left = false;
        if(col > 0 && !visited[row][col-1])
            left = recursion(board, word, index+1, row, col-1, visited);
        if(left)  return true;

        boolean right = false;
        if(col < board[0].length-1 && !visited[row][col+1])
            right = recursion(board, word, index+1, row, col+1, visited);
        if(right)  return true;

        visited[row][col] = false;
        return false;
    }

}
