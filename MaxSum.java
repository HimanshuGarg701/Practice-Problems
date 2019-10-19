
package leetcode.practice;

/**
 *
 * @author Himanshu Garg
 */
public class MaxSum {

    public static void main(String[] args){
        System.out.println("The maximun sum of subArray sized 3 is: " + findSum(new int[] {1,4,3,5,6,4,2,6}, 3));
    }
    
    public static int findSum(int[] arr, int k){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length; i++){
            currentSum += arr[i];
            if(i>=k-1){
                maxSum = Math.max(maxSum, currentSum);
                currentSum -= arr[i-(k-1)];
            }
        }
        return maxSum;
    }
}

