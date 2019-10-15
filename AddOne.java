
package leetcode.practice;
import java.util.*;
/**
 *
 * @author Himanshu GARG
 */
public class AddOne {
    public static ArrayList<Integer> plusOne(ArrayList<Integer> list){
        int size = list.size();
        list.set(size-1, list.get(size-1) + 1);
        for(int i = size-1; i>0 && list.get(i)==10; i--){
            list.set(i, 0);
            list.set(i-1, list.get(i-1)+1);
        }
        
        if(list.get(0) == 10){
            list.set(0, 0);
            list.add(0,1);
        }
        
        return list;
    }
    
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(9);
        arr.add(9);
        arr.add(9);
        
        ArrayList<Integer> answer = plusOne(arr);
        for(int x : answer){
            System.out.print(x + " ");
        }
    }
}
