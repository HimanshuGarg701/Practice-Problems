
package leetcode.practice.Matrix;

import java.util.Arrays;

/**
 *
 * @author Himanshu Garg
 */
public class TotalPathsFirstToLast {
    public static void main(String[] args){
        int[][] matrix = {
                         {1,2,3,4,5},
                         {5,6,7,8,9},
                         {1,2,3,4,5},
                         {1,2,3,4,5},
                         {2,4,6,7,8}
                         };
        
        System.out.println("Number of Ways we can reach the last value is : " + numWays(matrix));
    }
    
    public static int numWays(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] answer = new int[rows][cols];
        for(int i=0; i<cols; i++){
            answer[0][i] = 1;
        }
        
        for(int i=0 ; i<rows; i++){
            answer[i][0] = 1;
        }
        
        for(int i = 1; i<rows; i++){
            for(int j=1; j<cols; j++){
                answer[i][j] = answer[i-1][j] + answer[i][j-1];
            }
        }
        for(int[] x : answer){
            System.out.println(Arrays.toString(x));
        }
        return answer[rows-1][cols-1];
    }
}
