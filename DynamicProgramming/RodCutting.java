package DynamicProgramming;

import java.util.Arrays;

public class RodCutting {
    public static void main(String[] args){
        int[] lengths = {1,2,3,4};
        int[] profits = {2,5,7,8};
        int lookFor = 5;
        int[][] matrix = new int[lengths.length][lookFor+1];
        for(int i=0; i<matrix.length; i++){
            matrix[0][i] = 0;
        }

        for(int i=1; i<matrix[0].length; i++){
            if(lengths[0]<=i && i%lengths[0]==0){
                int nums = i/lengths[0];
                matrix[0][i] = profits[0]*nums;
            }
        }

        findProfit(matrix, lengths, profits);
    }

    public static void findProfit(int[][] matrix, int[] lengths, int[] profits){
        for(int i=1; i<matrix.length; i++){
            for(int j=1; j<matrix[0].length; j++){
                if(lengths[i]<=j){
                    matrix[i][j] = Math.max(matrix[i-1][j], profits[i] + matrix[i][j-lengths[i]]);
                }else{
                    matrix[i][j] = matrix[i-1][j];
                }
            }
        }

        System.out.println("Max profit is: " + matrix[matrix.length-1][matrix[0].length-1]);
        for(int[] i: matrix){
            System.out.println(Arrays.toString(i));
        }
    }
}
