
package leetcode.practice;

/**
 *
 * @author Himanshu Garg
 */
public class sortingBinary {
    public static int[] sortBinary(int[] arr){
        int start = 0;
        int last = arr.length-1;
        while(start<=last){
            if(arr[start]==1){
                int temp = arr[last];
                arr[last] = arr[start];
                arr[start] = temp;
                last--;
            }else{
                start++;
            }
        }
        return arr;
    }
    
    public static void main(String[] args){
        int[] arr = {0,1,0,1,0,1,0,1,0,0};
        
        int[] answer = sortBinary(arr);
        
        for(int x : answer){
            System.out.print(x + " ");
        }
        System.out.println("");
    }
}
