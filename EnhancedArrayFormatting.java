
package leetcode.practice;

/**
 *
 * @author Himanshu GARG
 */

/*
    An array is passed to a function and an integer (index).
    arrange samller numbers before that index value and same numbers with that index and larger after that index
*/
public class EnhancedArrayFormatting {
    public static int[] manageArray(int[] arr, int index){
        int pivotValue = arr[index];
        int start = 0; // will go from 0 to pivot value
        int pivot = 0; // will go from 1st pivot to last pivot
        int end = arr.length -1; // will go from last index of array to last pivot
        while(pivot < end){
            if(arr[pivot] < pivotValue){
                int temp = arr[pivot];
                arr[pivot] = arr[start];
                arr[start] = temp;
                start++;
                pivot++;
            }
            else if(arr[pivot]==pivotValue){
                pivot++;
            }
            else{               // When the value is larger than pivotValue
                int temp = arr[pivot];
                arr[pivot] = arr[end];
                arr[end] = temp;
                end--;
            }
        }
        return arr;
    }
    
    public static void main(String[] args){
        int[] arr = {1,1,2,3,4,3,2,1,4,5,6,4,7,8};
        
        int[] answer = manageArray(arr, 4);
        for(int x : answer){
            System.out.print(x + " ");
        }
    }
}
