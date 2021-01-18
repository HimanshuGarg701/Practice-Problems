package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;

public class SumSubset {
    public static void main(String[] args){
        int[] arr = {2,3,7,8,9};
        int element = 11;
        boolean[][] matrix = new boolean[arr.length+1][element+1];
        for(int i=0; i<matrix.length; i++){
            matrix[i][0] = true;
        }
        checkIfPresent(arr, element, matrix);
    }

    public static void checkIfPresent(int[] arr, int element, boolean[][] matrix){
        for(int i=1; i<matrix.length; i++){
            for(int j=1; j<matrix[0].length; j++){
                if(j>= arr[i-1]){
                    matrix[i][j] = matrix[i-1][j-arr[i-1]] || matrix[i-1][j];
                }else{
                    matrix[i][j] = matrix[i-1][j];
                }
            }
        }

        for(boolean[] i: matrix){
            System.out.println(Arrays.toString(i));
        }
    }
}
