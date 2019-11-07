
package leetcode.practice;

/**
 *
 * @author Himanshu Garg
 */
public class sortSubArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,7,5,6,4,8};
        findSubArray(arr);
    }
    
    public static void findSubArray(int[] arr){
        int maxStart = Integer.MIN_VALUE;
        int lastIndex = 0;
        for(int i=0; i<arr.length; i++){
            maxStart = Math.max(maxStart, arr[i]);
            if(arr[i]<maxStart){
                lastIndex = i;
            }
        }
        int minEnd = Integer.MAX_VALUE;
        int firstIndex = 0;
        for(int i=arr.length-1; i>=0; i--){
            minEnd = Math.min(minEnd, arr[i]);
            if(arr[i]> minEnd){
                firstIndex = i;
            }
        }
        System.out.println("The array has to change from index " + firstIndex + " to" + lastIndex);
    }
}
