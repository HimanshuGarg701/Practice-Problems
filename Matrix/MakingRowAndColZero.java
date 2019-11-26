
package leetcode.practice.Matrix;
import java.util.*;
/**
 *
 * @author Himanshu Garg
 */
public class MakingRowAndColZero {
    public static void main(String[] args){
        int[][] matrix = {
                        {1,1,1,1,1},
                        {1,1,0,1,1},
                        {1,1,1,1,1},
                        {1,0,1,1,1},
                        {1,1,1,1,1}
                        };
        System.out.println("Original Matrix is : ");
        for(int[] x : matrix){
            System.out.println(Arrays.toString(x));
        }
        int[][] answer = transformedMatrix(matrix);
        System.out.println();
        System.out.println("Transformed Matrix is : ");
        for(int[] x : answer){
            System.out.println(Arrays.toString(x));
        }
    }
    
    public static int[][] transformedMatrix(int[][] matrix){
        // Checking the zero in various rows and then marking 
        // row 1 and column 1 as --> 2
        // Finally making the rows and cols zero
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    matrix[0][j] = -1;
                    matrix[i][0] = -1;
                }
            }
        }
        // Transforming desired columns to zero
        for(int i=0; i<matrix[0].length; i++){
            if(matrix[0][i] == -1){
                for(int j=0; j<matrix.length; j++){
                    matrix[j][i] = 0;
                }
            }
        }
        
        for(int i=0; i<matrix.length; i++){
            if(matrix[i][0] == -1){
                for(int j=0; j<matrix[0].length; j++){
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }
}
