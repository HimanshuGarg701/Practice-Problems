
package leetcode.practice;

/**
 *
 * @author Himanshu Garg
 */
public class MaxiMumDifference {
    public static void main(String[] args){
        int[] arr = {4,5,1,2,3};
        System.out.println("Maximum difference with smaller element coming first is: " + getDiff(arr));
    }
    
    public static int getDiff(int[] arr){
        int len = arr.length;
        int maxNum = arr[len-1];
        int maxDiff = Integer.MIN_VALUE;
        
        for(int i = len-2; i>=0; i--){
            if(arr[i] > maxNum){
                maxNum = arr[i];
            }
            else{
                maxDiff = Math.max(maxDiff, maxNum - arr[i]);
            }
        }
        return maxDiff;
    }
}
