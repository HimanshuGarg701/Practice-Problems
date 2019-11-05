
package leetcode.practice;
import java.util.*;
/**
 *
 * @author Himanshu Garg
 */
public class CheckZeroSum {
    public static void main(String[] args){
        int[] arr = {2,3,-5,1,4};
        System.out.println(checkZero(arr));
    }
    
    public static boolean checkZero(int[] x){
        HashSet<Integer> bag = new HashSet<>();
        bag.add(0);
        int sum = 0;
        for(int i=0; i<x.length; i++){
            sum += x[i];
            if(bag.contains(sum)){
                return true;
            }
        }
        return false;
    }
}
