
package leetcode.practice;
import java.util.*;
/**
 *
 * @author Himanshu Garg
 */
public class SumOfThree { 
    public static void main(String[] args){
        int[] arr = {1,2,4,5,3};
        
        System.out.println("The report that the sum exists is: " + sumExists(arr, 11));
    }
    
    public static boolean sumExists(int arr[], int sum){
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<arr.length; i++){
            map.put(arr[i], i);
        }
        
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                int tempSum = arr[i] + arr[j];
                int target = sum - tempSum;
                
                if(map.containsKey(target) && ((map.get(target)!=i) && (map.get(target)!=j))){ 
                    System.out.println("Therefore : " + arr[i] + " + " + arr[j] + " + " + target + " = " + sum);
                    return true;   
                }
            }
        }
        return false;
    }
}
