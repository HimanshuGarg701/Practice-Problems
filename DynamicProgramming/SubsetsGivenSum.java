package DynamicProgramming;

public class SubsetsGivenSum {
    public static void main(String[] args){
        int[] nums = {4,4,8};
        int diff = 0;

        //Count subsets with difference equal to 0

        int sum = 0;
        for(int i: nums){
            sum += i;
        }

        boolean matrix[][] = new boolean[nums.length+1][sum+1];
        for(int i=0; i<matrix.length; i++){
            matrix[i][0] = true;
        }
        findSubsetsWithGivenDiff(matrix, nums, sum, diff);
    }

    public static void findSubsetsWithGivenDiff(boolean[][] matrix, int[] nums, int sum, int diff){
        for(int i=1; i<matrix.length; i++){
            for(int j=1; j<matrix[0].length; j++){
                if(j >= nums[i-1]){
                    matrix[i][j] = matrix[i-1][j] || matrix[i-1][j-nums[i-1]];
                }else{
                    matrix[i][j] = matrix[i-1][j];
                }
            }
        }

        int answer = 0;
        for(int i=0; i<matrix[0].length; i++){
            if(matrix[matrix.length-1][i]){
                int tempResult = sum - (2*i);
                if(tempResult==diff){
                    answer++;
                }
            }
        }

        System.out.println("Number of subsets with given diff is " + answer);
    }
}
