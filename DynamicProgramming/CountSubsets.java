package DynamicProgramming;

import java.util.Arrays;

public class CountSubsets {
    public static void main(String[] args){
        int[] nums = {6,4};
        int element = 6;
        int[][] matrix = new int[nums.length+1][element+1];

        for(int i=0; i<matrix.length; i++){
            matrix[i][0] = 0;
        }

        countSubsets(nums, element, matrix);
    }

    public static void countSubsets(int[] nums, int element, int[][] matrix){
        for(int i=1; i<matrix.length; i++){
            for(int j=1; j<matrix[0].length; j++){
                if(j >= nums[i-1]){
                    matrix[i][j] = Math.max(matrix[i-1][j] , 1+ matrix[i-1][j-nums[i-1]]);
                }else{
                    matrix[i][j] = matrix[i-1][j];
                }
            }
        }
        for(int i[]: matrix){
            System.out.println(Arrays.toString(i));
        }
        System.out.println("Number of subsets " + matrix[matrix.length-1][matrix[0].length-1]);
    }
}
