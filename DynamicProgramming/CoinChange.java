package DynamicProgramming;

import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args){
        int[] coins = {3,2,8};
        int sum = 11;

        int[][] matrix = new int[coins.length][sum+1];
        for(int i=0; i<matrix[0].length; i++){
            if(i%coins[0]==0){
                matrix[0][i]= i/coins[0];
            }else{
                matrix[0][i] = Integer.MAX_VALUE-coins.length;
            }
        }
        for(int i=0; i<matrix.length; i++){
            matrix[i][0] = 0;
        }
        System.out.println("Minimum coins required: " + findMin(coins, sum, matrix));
        for(int[] i: matrix){
            System.out.println(Arrays.toString(i));
        }
    }

    public static int findMin(int[] coins, int sum, int[][] matrix){
        for(int i=1; i<matrix.length; i++){
            for(int j=1; j<matrix[0].length; j++){
                matrix[i][j] = matrix[i-1][j];
                if(coins[i]<=j){
                    matrix[i][j] = Math.min(matrix[i-1][j], 1+matrix[i][j-coins[i]]);
                }
            }
        }
        return matrix[matrix.length-1][matrix[0].length-1];
    }
}

//  0 1 2 3 4 5
//0 0 I I I I I
//1 0 1 2 3 4 5
//2 0 1 1 2 2 3
//3 0 1 1 1 2 2