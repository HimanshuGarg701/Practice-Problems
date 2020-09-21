package Mix;

public class maxSum {
    public static void main(String[] args){
        int[] nums = {2,3,-6,4,2,-8,3};
        int currSum = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i: nums){
            currSum = Math.max(i, i+currSum);
            max = Math.max(max, currSum);
        }
        System.out.println("The max sum in array is: " + max);
    }
}
