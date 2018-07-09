package com.zedrays.GFG;

import com.zedrays.Common.BasicExecutionPS;

import java.util.Arrays;

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
            case "UGLY":
                uglyNumbers(10);
            case "FIBONACCI":
                Fibonacci(10);
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


    @Override
    public void uglyNumbers(int n) {

        int[] ugly = new int[n];
        ugly[0] = 1;

        int i2 = 1;
        int i3 = 1;
        int i5 = 1;

        int ugly_2 = 2*i2;
        int ugly_3 = 3*i3;
        int ugly_5 = 5*i5;

        for(int i = 1; i<n;i++){

            ugly[i] = Math.min(ugly_5,Math.min(ugly_2,ugly_3));

            if(ugly[i] == ugly_2){
                i2++;
                ugly_2 = ugly_2*i2;
            }

            if(ugly[i] == ugly_3){
                i3++;
                ugly_3 = ugly_3*i3;
            }

            if(ugly[i] == ugly_5){
                i5++;
                ugly_5 = ugly_5*i5;
            }
        }

        Arrays.stream(ugly)
                .forEach(name -> System.out.print(name));

    }

    @Override
    public void Fibonacci(int n) {

        int[] fib = new int[n+1];

        fib[0] = 0;
        fib[1] = 1;

        int response = calculateFibDynamic(fib,n);
        System.out.println(response);
    }

    private int calculateFibDynamic(int[] fib,int n){

       for(int i =2;i<=n;i++){
         fib[i] = fib[i-1] + fib[i-2];
       }
       return fib[n];

    }


}