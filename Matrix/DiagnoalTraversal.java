
package leetcode.practice.Matrix;

/**
 *
 * @author Himanshu Garg
 */
public class DiagnoalTraversal {
    public static void main(String[] args){
        int[][] matrix = {
                        {1,2,3,4,5},
                        {2,3,4,5,6},
                        {3,4,5,6,7},
                        {4,5,6,7,8},
                        {5,6,7,8,9}
                      };
        
        printDiagonally(matrix);
    }
    
    public static void printDiagonally(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        // Printing the upper triangle
        for(int i=0; i<rows; i++){
            for(int j=i, k=0; j>=0 && k<cols; j--,k++){
                System.out.print(matrix[j][k] + "  ");
            }
            System.out.println();
        }
        
        for(int i= 1; i<matrix[0].length; i++){
            for(int j=i, k=rows-1; j<cols && k>0 ; j++, k--){
                System.out.print(matrix[j][k] + "  ");
            }
            System.out.println();
        }
    }
}
