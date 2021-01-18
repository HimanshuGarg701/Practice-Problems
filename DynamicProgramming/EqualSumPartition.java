package DynamicProgramming;

import java.util.Arrays;

public class EqualSumPartition {
    public static void main(String[] args){
        int[] arr = {2,3,7,8,10};

        int sum = 0;

        for(int i: arr){
            sum += i;
        }
        boolean[][] matrix = new boolean[arr.length+1][sum/2+1];


        for(int i=0; i<matrix.length; i++){
            matrix[i][0] = true;
        }
        if(sum%2!=0){
            System.out.println("Partition not possible");
        }else{
            findPartition(matrix, sum/2, arr);
        }
    }

    public static void findPartition(boolean[][] matrix, int element, int[] arr){
        for(int i=1; i<matrix.length; i++){
            for(int j=1; j<matrix[i].length; j++){
                if(j>= arr[i-1]){
                    matrix[i][j] = matrix[i-1][j] || matrix[i-1][j-arr[i-1]];
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
