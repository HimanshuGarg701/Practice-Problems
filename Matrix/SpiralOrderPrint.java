
package leetcode.practice.Matrix;

/**
 *
 * @author Himanshu Garg
 */
public class SpiralOrderPrint {
    public static void main(String[] args){
        int[][] matrix = {
                          {1,2,3,4,5},
                          {16,17,18,19,6},
                          {15,24,25,20,7},
                          {14,23,22,21,8},
                          {13,12,11,10,9}
                         };
        
        printMatrix(matrix);
    }
    
    public static void printMatrix(int[][] matrix){
        int left = 0;
        int right = matrix[0].length-1;
        int top = 0;
        int bottom = matrix[0].length-1;
        
        while(true){
            if(left>right){
                break;
            }
            // Moving left to right for top row
            for(int i= left; i<=right; i++){
                System.out.print(matrix[top][i] + "  ");
            }
            top++;
            if(top>bottom){
                break;
            }
            
            //Moving top to bottom for right column
            
            for(int i=top; i<=bottom; i++){
                System.out.print(matrix[i][right] + "  ");
            }
            right--;
            
            if(left>right){
                break;
            }
            
            //Moving right to left for bottom row
            
            for(int i=right; i>=left; i--){
                System.out.print(matrix[bottom][i] + "  ");
            }
            bottom--;
            
            if(top>bottom){
                break;
            }
            
            // Moving bottom to top for lefyt column
            
            for(int i=bottom; i>=top; i--){
                System.out.print(matrix[i][left] + "  ");
            }
            left++;
        }
        System.out.println();
    }
}
