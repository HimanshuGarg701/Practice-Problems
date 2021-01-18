package DynamicProgramming;

import java.util.Arrays;

public class RecursiveKnapSack {
    public static void main(String[] args){
        int[] values = {1,4,5,7,9};
        int[] weight = {1,2,3,4,5};
        int availableWeight = 7;
        int[][] matrix = new int[values.length+1][availableWeight+1];
        findMaxProfit(values, weight, availableWeight, values.length, matrix);

    }

    public static void findMaxProfit(int[] values, int[] weight, int availableWeight, int n, int[][] matrix){
        for(int i=1; i<matrix.length; i++){
            for(int j=1; j<matrix[0].length; j++){
                if(j>=weight[i-1]){
                    matrix[i][j] = Math.max(matrix[i-1][j], values[i-1] + matrix[i-1][j-weight[i-1]]);
                }else{
                    matrix[i][j] = matrix[i-1][j];
                }
            }
        }
        for(int i[]: matrix){
            System.out.println(Arrays.toString(i));
        }
        System.out.println("Maximum profit is: " + matrix[matrix.length-1][matrix[0].length-1]);
    }


}
