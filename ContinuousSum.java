
package leetcode.practice;

/**
 *
 * @author Himanshu Garg
 */
public class ContinuousSum {
    public static void main(String[] args){
        int[] arr = {1,2,-4,5,6,-10,5,-6,7};
        int[] answer = getSum(arr);
        System.out.print("SubArray is : ");
        for(int i : answer){
            System.out.print(i + " ");
        }
        System.out.println("");
    }
    
    public static int[] getSum(int[] arr){
        //Check for all negative numbers
        
        int x = 0;
        for(int i : arr){
            if(i < 0){
                x++;
            }
        }
        int maxSum = Integer.MIN_VALUE;
        if(x==arr.length){
            int[] answer = new int[1];
            for(int i : arr){
                maxSum = Math.max(maxSum, i);
                answer[0] = maxSum;
            }
            return answer;
        }
        else{
            int continuousSum = 0;
            int begin = 0;
            int start = 0;
            int end = 0;
            
            for(int i=0; i<arr.length; i++){
                continuousSum += arr[i];
                
                if(continuousSum < 0){
                    continuousSum = 0;
                    begin = i+1;
                }
                
                if(continuousSum>maxSum){
                    maxSum = continuousSum;
                    start = begin;
                    end = i;
                }
            }
            System.out.println(maxSum + " is the maximum sum.");
            int[] answer = new int[end-start+1];
            int sum = 0;
            
            for(int i = start; i<=end; i++){
                answer[sum] = arr[i];
                sum++;
            }
            return answer;
        } 
    }
}
