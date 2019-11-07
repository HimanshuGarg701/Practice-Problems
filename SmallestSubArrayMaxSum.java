
package leetcode.practice;

/**
 *
 * @author Himanshu Garg
 */
public class SmallestSubArrayMaxSum {
    public static void main(String[] args){
        int[] arr = {5,7,8,6,4,12,12};
        System.out.println(findSubArray(arr, 20));
    }
    
    public static int findSubArray(int[] arr, int sum){
        int start = 0;
        int len = Integer.MAX_VALUE;
        int continuousSum = 0;
        for(int i=0; i<arr.length; i++){
            continuousSum += arr[i];
            while(continuousSum>sum && start<=i){
                len = Math.min(len, i-start + 1);
                continuousSum -= arr[start];
                start++;
            }
        }
        return len;
    }
}
