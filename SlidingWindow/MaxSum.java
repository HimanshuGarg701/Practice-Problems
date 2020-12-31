package SlidingWindow;
//Find Maximum sum in a window sub array of size 3
public class MaxSum {
    public static void main(String[] args){
        int[] arr = {1,2,3,3,4,5,0,6};
        System.out.println("Max sum in sub array of given size is: " + findMaxSum(arr, 3));
    }

    public static int findMaxSum(int[] arr, int k){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;
        while(end<arr.length){
            currentSum += arr[end];

            if(end-start+1==k){
                maxSum = Math.max(maxSum, currentSum);
                currentSum -= arr[start];
                start++;
                end++;
            }else{
                end++;
            }
        }
        return maxSum;
    }
}
