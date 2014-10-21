package com.datastructure.array.haitao;

/**
 * Created by danzhu on 9/10/14.
 *
 * 题目：输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。

 例如：如果输入如下矩阵：

 1              2              3              4
 5              6              7              8
 9              10           11           12
 13           14           15           16

 则依次打印出数字1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10。
 */
public class PrintMatrixClockwisely {
    public static void main(String[] args){
        int[][] matrix = {{1,2,3,4},{5,6,7,8}};
        int[][] matrix2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int[][] matrix3 = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};


        printMatrixClockwisely(matrix);
    }

    public static void printMatrixClockwisely(int[][] matrix){
        if(matrix == null || matrix.length < 1 || matrix[0].length < 1)
            return;

        int startX = 0;
        int startY = 0;
        int row = matrix.length;
        int col = matrix[0].length;

        while(startX*2 < col && startY*2 < row){
            printCircle(matrix, startX, startY);
            startX++;
            startY++;
        }
    }

    public static void printCircle(int[][] matrix, int startX, int startY){
        int endX = matrix.length-1-startX;
        int endY = matrix[0].length-1-startY;

        for(int i = startY; i <= endY; i++){
            System.out.print(matrix[startX][i]+" ");
        }
        if(startX < endX){
            for(int i = startX+1; i <= endX; i++)
                System.out.print(matrix[i][endY]+" ");
        }
        if(startY < endY && startX < endX){
            for(int i = endY-1; i>=startY; i--)
                System.out.print(matrix[endX][i]+" ");
            for(int i = endX-1; i > startX; i--)
                System.out.print(matrix[i][startY]+" ");
        }
    }
}
