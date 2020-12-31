package Backtracking;

import java.util.Arrays;

public class Sudoku {
    public static void main(String[] args)
    {
        int grid[][] = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };

        solveSudoku(grid, 0, 0);

    }

    public static void solveSudoku(int[][] grid, int row, int col){
        int nextRow = 0;
        int nextCol = 0;
        if(row==grid.length){
            display(grid);
            return;
        }
        if(col == grid.length-1){
            nextRow = row+1;
            nextCol = 0;
        }else{
            nextCol = col + 1;
            nextRow = row;
        }

        if(grid[row][col]==0){
            for(int i=1; i<=9; i++){
                if(isValid(i, grid, row, col)){
                    grid[row][col] = i;
                    solveSudoku(grid, nextRow, nextCol);
                    grid[row][col] = 0;
                }
            }
        }else{
            solveSudoku(grid, nextRow, nextCol);
        }
    }

    public static void display(int[][] grid){
        for(int[] i: grid){
            System.out.println(Arrays.toString(i));
        }
    }

    public static boolean isValid(int num, int[][] grid, int row, int col){
        for(int i=0; i<grid.length; i++){
            if(grid[row][i]==num){
                return false;
            }
        }
        for(int i=0; i<grid.length; i++){
            if(grid[i][col]==num){
                return false;
            }
        }

        int sRow = (row/3)*3;

        for(int i=0; i<3; i++){
            int sCol = (col/3)*3;
            for(int j=0; j<3; j++){
                if(grid[sRow][sCol]==num)
                    return false;
                sCol++;
            }
            sRow++;
        }
        return true;
    }
}
