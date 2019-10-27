
package leetcode.practice;
import java.util.*;
/**
 *
 * @author Himanshu Garg
 */
public class sumZero {
    public static boolean findSumZero(int[] arr){
        HashSet<Integer> store = new HashSet<>();
        int sum = 0;
        store.add(0);
        
        for(int x: arr){
            sum += x;
            
            if(store.contains(sum)){
                return true;
            }
            store.add(sum);
        }
        return false;
    }
    
    public static void main(String[] args){
        int[] arr = {2,3,-5,2,4};
        System.out.println(findSumZero(arr));
    }
}
