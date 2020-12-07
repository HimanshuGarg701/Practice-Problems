package Backtracking;

import java.util.Arrays;

public class nQueens {
    public static void main(String[] args){
        int[][] grid = new int[8][8];
        int[] columns = new int[grid.length];
        int[] diaOne = new int[2*grid.length-1];
        int[] diaTwo = new int[2*grid.length-1];
        findPositions(grid, 0, columns, diaOne, diaTwo);
    }

    public static void findPositions(int[][] grid, int row, int[] col, int[] diaOne, int[] diaTwo) {
        if(row==grid.length){
            print(grid);
            return;
        }
        for(int i=0; i<grid.length; i++){
            if(col[i]!=1 && diaOne[i+row]!=1 && diaTwo[i-row+grid.length-1]!=1){
                grid[row][i] = 1;
                col[i] = 1;
                diaOne[i+row] = 1;
                diaTwo[i-row+grid.length-1] = 1;
                findPositions(grid, row+1, col, diaOne, diaTwo);
                grid[row][i] = 0;
                col[i] = 0;
                diaOne[i+row] = 0;
                diaTwo[i-row+grid.length-1] = 0;
            }
        }
    }

    public static void print(int[][] grid){
        for(int[] i: grid){
            System.out.println(Arrays.toString(i));
        }

        System.out.println("--------------------------");
    }
}
