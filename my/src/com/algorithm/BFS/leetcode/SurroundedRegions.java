package com.algorithm.BFS.leetcode;

import java.util.LinkedList;

/**
 * Created by danzhu on 7/4/14.
 * Given a 2D board containing 'X' and 'O', capture all regions surrounded by 'X'.
 *
 * A region is captured by flipping all 'O's into 'X's in that surrounded region.
 *
 * For example,
 * X X X X
 * X O O X
 * X X O X
 * X O X X
 * After running your function, the board should be:
 *
 * X X X X
 * X X X X
 * X X X X
 * X O X X
 *
 */

public class SurroundedRegions {

    public void solve(char[][] board) {

        int row = board.length;
        if(row == 0)    return;
        int col = board[0].length;
        if(col == 0)    return;

        LinkedList<Integer> indexX = new LinkedList<Integer>();
        LinkedList<Integer> indexY = new LinkedList<Integer>();

        for(int i = 0; i < col; i++){
            if (board[0][i] == 'O'){
                indexX.push(0);
                indexY.push(i);
                board[0][i] = 'Y';
            }
            if (board[row-1][i] == 'O'){
                indexX.push(row-1);
                indexY.push(i);
                board[row-1][i] = 'Y';
            }
        }

        for(int i = 0; i < row; i++){
            if (board[i][0] == 'O'){
                indexX.push(i);
                indexY.push(0);
                board[i][0] = 'Y';
            }
            if (board[i][col-1] == 'O'){
                indexX.push(i);
                indexY.push(col-1);
                board[i][col-1] = 'Y';
            }
        }

        while(!indexX.isEmpty() && !indexY.isEmpty()){
            int x = indexX.pop();
            int y = indexY.pop();
            board[x][y] = 'Y';
            if(x>0 && board[x-1][y]=='O') { indexX.push(x-1); indexY.push(y); }
            if(x<row-1 && board[x+1][y]=='O') { indexX.push(x+1); indexY.push(y); }
            if(y>0 && board[x][y-1]=='O') { indexX.push(x); indexY.push(y-1); }
            if(y<col-1 && board[x][y+1]=='O') { indexX.push(x); indexY.push(y+1); }
        }

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(board[i][j] == 'O') board[i][j] = 'X';
                if(board[i][j] == 'Y') board[i][j] = 'O';
            }
        }
    }

}
