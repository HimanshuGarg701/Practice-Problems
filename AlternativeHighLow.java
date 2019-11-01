
package leetcode.practice;

/**
 *
 * @author Himanshu Garg
 */
public class AlternativeHighLow {
    public static int[] highLow(int[] arr){
        for(int i=1; i<arr.length-1; i=i+2){
            if(arr[i-1] > arr[i]){
                int temp = arr[i-1];
                arr[i-1] = arr[i];
                arr[i] = temp;
            }
            
            if(arr[i+1] > arr[i]){
                int temp1 = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = temp1;
            }
        }
        return arr;
    }
    
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] answer = highLow(arr);
        
        for(int x : answer){
            System.out.print(x + " ");
        }
    }
}
