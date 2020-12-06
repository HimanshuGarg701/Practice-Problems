package Backtracking;

import java.util.Arrays;

public class SudokuSolver {
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

        solveSuduko(grid, 0, 0);

    }

    public static void solveSuduko(int[][] grid, int column, int row){
        int nc = 0;
        int nr = 0;
        if(row==grid.length) {
            print(grid);
            return;
        }
        if(column == grid.length-1){
            nc = 0;
            nr = row+1;
        }else{
            nr = row;
            nc = column+1;
        }
        if(grid[row][column]==0) {
            for (int i = 1; i <= 9; i++) {
                if (isValid(grid, row, column, i)) {
                    grid[row][column] = i;
                    solveSuduko(grid, nc, nr);
                    grid[row][column] = 0;
                }
            }
        }else{
            solveSuduko(grid, nc, nr);
        }
    }

    public static void print(int[][] grid){
        for(int[] i: grid){
            System.out.println(Arrays.toString(i));
        }
    }

    public static boolean isValid(int[][] grid, int row, int column, int element){
        for(int i=0; i<grid.length; i++){
           if(grid[row][i] == element)
               return false;
        }

        for(int i=0; i<grid.length; i++){
            if(grid[i][column]==element){
                return false;
            }
        }

        int startRow = (row/3)*3;

        for(int i=0; i<3; i++){
            int startColumn = (column/3)*3;
            for(int j=0; j<3; j++){
                if(grid[startRow][startColumn]==element)
                    return false;
                startColumn++;
            }
            startRow++;
        }

        return true;
    }

}
