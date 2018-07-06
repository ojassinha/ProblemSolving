package com.zedrays.GFG;

import com.zedrays.Common.BasicExecutionPS;

/**
 * Created by zedray on 5/11/18.
 */
public class GFGProblemPSImpl implements GFGProblemsPS, BasicExecutionPS {

    @Override
    public void run(String nameOfProblem) {

        switch (nameOfProblem){
            // https://www.geeksforgeeks.org/flood-fill-algorithm-implement-fill-paint/
            case "FLOOD_FILL":
                runFloodFillAlgo();
        }
    }

    private void runFloodFillAlgo(){

        int[][] board = new int[5][5];

        initializeBoard(board);
        printBoard(board);

        floodFillAlgo(board,2,2,6);
        printBoard(board);
    }

    private void printBoard(int[][] board){
        for(int i = 0;i<5;i++){
            for(int j = 0;j<5;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    private void initializeBoard(int[][] board){
        for(int i = 2;i<5;i++){
            for(int j = 2;j<5;j++){
                board[i][j] = 5;
            }
        }

        board[0][0]= 5;
        board[0][1] = 5;
        board[0][2] = 5;
        board[1][2] = 5;

    }

    @Override
    public void floodFillAlgo(int[][] board,int x,int y, int newColor) {

        int row = board.length;
        int col = board[0].length;
        fillColor(x,y,board[x][y],newColor, row, col,board);

    }

    private static void fillColor(int x,int y,int oldColor,int newColor,int row,int col,int[][] board){

        if(x>row-1 || y > col-1 || x <0 || y <0) {
            return;
        }

        if(board[x][y] != oldColor) {
            return;
        }

        System.out.println("X = "+x+" Y = "+y);
               fillColor(x+1,y,oldColor,newColor,row,col,board);
        board[x][y] = newColor;
        System.out.println("X = "+x+" Y = "+y);
        fillColor(x,y+1,oldColor,newColor,row,col,board);
        board[x][y] = newColor;
        System.out.println("X = "+x+" Y = "+y);
        fillColor(x-1,y,oldColor,newColor,row,col,board);
        board[x][y] = newColor;
        System.out.println("X = "+x+" Y = "+y);
        fillColor(x,y-1,oldColor,newColor,row,col,board);
        board[x][y] = newColor;




    }

}