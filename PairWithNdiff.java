
package leetcode.practice;
import java.util.*;
/**
 *
 * @author Himanshu Garg
 */
public class PairWithNdiff {
    public static void main(String[] args ){
        int[] arr = {1,2,3,3,4,5,5};
        findPair(arr, 3);
    }
    
    public static void findPair(int[] arr, int diff){
        HashSet<Integer> set = new HashSet<>();
        for(int x : arr){
            set.add(x);
        }
        
        for(int x : arr){
            if(set.contains(x+diff) || set.contains(x-diff)){
                if(x!=x+diff && x!=x-diff){
                    if(set.contains(x+diff)){
                        System.out.println("( " + x + " , " + (x+diff) + " )");
                        set.remove(x+diff);
                    }
                    else{
                        System.out.println("( " + x + " , " + (x-diff) + " )");
                        set.remove(x-diff);
                    }
                    set.remove(x);
                }
            }
        }
    }
}
