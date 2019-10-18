
package leetcode.practice;

/**
 *
 * @author Himanshu Garg
 */

/*
    Given an array, Tell whether the user can reach the last index or not
    Each index value represents the maximum jump
*/
public class BoardGame {
    public static boolean winOrNot(int[] arr){
        int disCovered = 0;
        int end = arr.length-1;
        for(int i=0; i<=disCovered && disCovered<end; i++){
            disCovered = Math.max(disCovered, i+arr[i]);
        }
        
        if(disCovered>=end){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args){
        int[] arr = {3,3,1,0,2,0,1};
       
    }
}
