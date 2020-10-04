package DynamicProgramming;

import java.util.Arrays;

public class ZeroOne {
    public static void main(String[] args){
        int[] weight = {1,3,4,5,6};
        int maxWt = 8;
        int[] values = {3,4,2,7,1};

        int[][] matrix = new int[weight.length][maxWt+1];
        for(int i=0; i<weight.length; i++){
            matrix[i][0] = 0;
        }

        for(int i=0; i<matrix[0].length; i++){
            if(i>=weight[0]){
                matrix[0][i] = values[0];
            }else{
                matrix[0][i] = 0;
            }
        }

        System.out.println("Max Profit is: " + findMax(matrix, weight, values, maxWt));
    }

    public static int findMax(int[][] matrix, int[] weight, int[] values, int maxWt){
        for(int i=1; i<matrix.length; i++){
            for(int j=1; j<matrix[i].length; j++){
                if(weight[i]<=j){
                    matrix[i][j] = Math.max(values[i]+matrix[i-1][j-weight[i]], matrix[i-1][j]);
                }else{
                    matrix[i][j] = matrix[i-1][j];
                }
            }
        }
        for(int[] i: matrix){
            System.out.println(Arrays.toString(i));
        }
        return matrix[matrix.length-1][matrix[0].length-1];
    }
}
