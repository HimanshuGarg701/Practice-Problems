package DynamicProgramming;

import java.util.Arrays;

public class CheckingSubsetSum {
    public static void main(String[] args){
        int[] nums = {3,4,7,1,2,9,5};
        int find = 6;
        boolean[][] matrix = new boolean[nums.length][find+1];

        for(int i=0; i<matrix.length; i++){
            matrix[i][0] = true;
        }

        for(int i=0; i<matrix[0].length; i++){
            if(i==nums[0]){
                matrix[0][i] = true;
            }
        }

        System.out.println("12 sum subset exists? " + checkSum(matrix, nums));

        for(boolean[] i:matrix){
            System.out.println(Arrays.toString(i));
        }
    }

    public static boolean checkSum(boolean[][] matrix, int[] nums){
        for(int i=1; i<matrix.length; i++){
            for(int j=1; j<matrix[0].length; j++){
                matrix[i][j] = matrix[i-1][j];
                if(nums[i]<=j){
                    matrix[i][j] =  matrix[i-1][j] || matrix[i-1][j-nums[i]];
                }
            }
        }
        return matrix[matrix.length-1][matrix[0].length-1];
    }
}
