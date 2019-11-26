
package leetcode.practice.Matrix;
import java.util.*;
/**
 *
 * @author Himanshu Garg
 */
public class DiagonalSort {
    public static void main(String[] args){
        int[][] matrix = {
                         {5,4,6,8,2},
                         {5,7,9,4,2},
                         {8,7,8,3,1},
                         {4,5,6,4,8},
                         {11,12,13,14,15}
                         };
        System.out.println("The original matrix is : ");
        
        for(int[] x : matrix){
            System.out.println(Arrays.toString(x));
        }
        
        int[][] sortedMatrix = findSorted(matrix);
        
        System.out.println();
        System.out.println("The diagonally sorted matrix is : ");
        for(int[] x : sortedMatrix){
            System.out.println(Arrays.toString(x));
        }
    }
    
    public static int[][] findSorted(int[][] matrix){
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        int index = 1;
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        // Upper triangular diagonal traversal and sorting
        for(int i=0; i<rows; i++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=i, k=0; k<cols && j>=0 ; j-- , k++){
                list.add(matrix[j][k]);
            }
            Collections.sort(list);
            map.put(index, list);
            index++;
        }
        
        // Lower Triangle diagonal traversal and sorting
        for(int i = 1; i<matrix[0].length; i++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=i, k=rows-1 ; j<cols && k>=0 ; j++, k--){
                list.add(matrix[k][j]);
            }
            Collections.sort(list);
            map.put(index, list);
            index++;
        }
        
        // Rearranging the matrix in sorted form
        // Upper Triangle
        index = 1;
        int count = 0;
        for(int i=0; i<rows; i++){
            for(int j=i, k=0; k<cols && j>=0 ; j-- , k++){
                matrix[j][k] = map.get(index).get(count);
                count++;
            }
            count = 0;
            index++;
        }
        
        // Lower Triangle
        for(int i = 1; i<matrix[0].length; i++){
            for(int j=i, k=rows-1 ; j<cols && k>=0 ; j++, k--){
             matrix[k][j] = map.get(index).get(count);
                count++;
            }
            count = 0;
            index++;
        }
        return matrix;
    }
}
