
package leetcode.practice.Matrix;

import java.util.Arrays;

/**
 *
 * @author Himanshu Garg
 */
public class MinimumCostPath {
    public static void main(String[] args){
        int[][] matrix= {
                        {1,2,4,5,3},
                        {4,5,3,2,7},
                        {3,4,1,2,3},
                        {3,4,6,2,1},
                        {1,2,5,6,7}
                        };
        
        System.out.println("The given matrix is: ");
        for(int[] x : matrix){
            System.out.println(Arrays.toString(x));
        }
        System.out.println();
        System.out.println("The minimum cost to reach the last item is: " + findCost(matrix));
    }
    
    public static int findCost(int[][] matrix){
        StringBuilder path = new StringBuilder();
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int[][] helper = new int[rows][cols];
        helper[0][0] = matrix[0][0];
        
        // Filling the first row with the cost
        for(int i=1; i<cols; i++){
            helper[0][i] = helper[0][i-1] + matrix[0][i];
        }
        
        // Filling the first column with the cost
        for(int i=1; i<rows; i++){
            helper[i][0] = helper[i-1][0] + matrix[i][0]; 
        }
        
        for(int i=1; i<rows; i++){
            for(int j=1; j<cols; j++){
                helper[i][j] = Math.min(helper[i-1][j], helper[i][j-1]) + matrix[i][j];
            }
        }
        
        System.out.println();
        
        System.out.println("PRINTING OUT THE PATH");
        path.append(matrix[rows-1][cols-1] + "  ");
        int row = rows-1;
        int col = cols-1;
        while(true){
            int side = helper[row-1][col] < helper[row][col-1] ? 1: 0;
            if(side==1){
                path.append(matrix[row-1][col] + "  ");
                row -= 1;
            }
            else if(side==0){
                path.append(matrix[row][col-1] + "  ");
                col -= 1;
            }
            if(row==0 && col!=0){
                while(col!=0){
                    path.append(matrix[row][col-1] + "  ");
                    col -= 1;
                }
                break;
            }
            if(col ==0 && row!=0){
                while(row!=0){
                    path.append(matrix[row-1][col] + "  ");
                    row -= 1;
                }
                break;
            }
            
        }
        System.out.println();
        System.out.println(path.reverse());
        return helper[rows-1][cols-1];
    }
}
