
package leetcode.practice;

/**
 *
 * @author Himanshu Garg
 */
public class givenSumSubArray {
    public static void main(String[] args){
        int[] arr = {1,2,4,0,1}; 
        System.out.println("The given sum is present : " + findSum(arr, 5));
    }
    
    public static boolean findSum(int[] arr, int sum){
        int continuousSum = 0;
        int lastIndex = 0;
        for(int i=0; i<arr.length;i++){
            
            while(continuousSum<sum && lastIndex<arr.length){
                System.out.println("hry");
                continuousSum += arr[lastIndex];
                lastIndex++;
            }
            
            if(continuousSum==sum){
                System.out.println("The subArray start from: " + i + " and end at: " + lastIndex);
                return true;
            }
            continuousSum -= arr[i];
        }
        return false;
    }
}
