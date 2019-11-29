
package leetcode.practice;

import java.util.ArrayList;

/**
 *
 * @author Himanshu Garg
 */
public class MissingElement {
    public static void main(String[] args){
        int[] arr = {1,2,4,5,6};
        
        System.out.println("The Missing element is: " + findMissing(arr));
    }
    
    public static int findMissing(int[] arr){
        int minimum = arr[0];
        ArrayList<Integer> store = new ArrayList<>();
        for(int i = 0; i<arr.length; i++){
            store.add(arr[i]);
            minimum = Math.min(minimum, arr[i]);
        }
        
        for(int i=minimum; i<arr.length; i++){
            if(!store.contains(i)){
                return i;
            }
        }
        return -100;
    }
}
