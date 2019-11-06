
package leetcode.practice;

/**
 *
 * @author Himanshu Garg
 */
public class FindMidIndex {
    public static void main(String[] args){
        int[] arr = {1,2,3,5,6,0,0};
        System.out.println("Print the mid index: " + findEqui(arr));
    }
    
    public static int findEqui(int[] arr){
        int sum = 0;
        for(int i : arr){
            sum += i; 
        }
        
        int Subsum = 0;
        for(int i =0; i<arr.length-1; i++){
            Subsum += arr[i];
            if(sum - Subsum-arr[i+1] == Subsum){
                return i+1;
            }
        }
        return -1;
    }
}
