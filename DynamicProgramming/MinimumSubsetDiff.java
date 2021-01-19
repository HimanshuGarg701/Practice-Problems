package DynamicProgramming;

import java.util.Arrays;

public class MinimumSubsetDiff {
    public static void main(String[] args){
        int[] nums = {2,4,5,10};
        //Find s1-s2 = min diff
        //we know s1+s2 = total, therefore s1 = total - s2
        //substituting total - s2 - s2 = min diff
        // total -2 s2 = min diff
        int sum = 0;
        for(int i: nums){
            sum += i;
        }

        boolean[][] matrix = new boolean[nums.length+1][sum+1];

        for(int i=0; i<matrix.length; i++){
            matrix[i][0] = true;
        }

        findMinDiff(matrix, nums, sum);
    }

    public static void findMinDiff(boolean[][] matrix, int[] nums, int sum){
        for(int i=1; i<matrix.length; i++){
            for(int j=1; j<matrix[0].length; j++){
                if(j >= nums[i-1]){
                    matrix[i][j] = matrix[i-1][j] || matrix[i-1][j-nums[i-1]];
                }else{
                    matrix[i][j] = matrix[i-1][j];
                }
            }
        }

        for(boolean[] i: matrix){
            System.out.println(Arrays.toString(i));
        }

        int min = Integer.MAX_VALUE;
        for(int i=0; i<matrix[0].length; i++){
            if(matrix[matrix.length-1][i]){
                int res = Math.abs(sum - (2*i));
                min = Math.min(min, res);
            }
        }

        System.out.println(min);
    }
}
