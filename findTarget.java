
package leetcode.practice;
import java.util.*;
/**
 *
 * @author Himanshu Garg
 */
public class findTarget {
    public static boolean findNum(int[] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<arr.length; i++){
            map.put(arr[i], i);
        }
        
        for(int x=0; x<arr.length; x++){
            int first = arr[x];
            int second = target - first;
            if(map.containsKey(second) && map.get(second)!=x){
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        
        System.out.println(findNum(arr, 11));
    }
}
