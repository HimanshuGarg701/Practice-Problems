
package leetcode.practice;

/**
 *
 * @author Himanshu Garg
 */
public class MaxSumLimitedSubArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,3,6,5,-8};
        System.out.println("Minimum sum is : " + findMin(arr, 3));
    }
    
    public static int findMin(int[] arr, int k){
        int sum = 0;
        int minSum = Integer.MAX_VALUE;
        
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
            if(i >=k-1){
                if(sum<minSum){
                    minSum = sum;
                }
                sum = sum - arr[i-k+1];
            }
        }
        return minSum;
    }
}
