
package leetcode.practice;
import java.util.*;
/**
 *
 * @author Himanshu Garg
 */
public class TwoSum {
    public static void main(String[] args){
        System.out.println("The sum exists statement is: " + isPresent(new int[] {4,7,1,-3,2}, 100));
    }
    
    public static boolean isPresent(int[] arr, int key){
        HashMap<Integer, Integer> container = new HashMap<>();
        
        
        for(int i=0; i<arr.length; i++){
            container.put(arr[i], i);
        }
        
        for(int i=0; i<arr.length; i++){
            int first = arr[i];
            int second = first-key;
            if(container.containsKey(second) && i!=container.get(second)){
                return true;
            }
        }
        return false;
    }
}
