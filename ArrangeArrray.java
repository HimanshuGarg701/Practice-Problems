
package leetcode.practice;

/**
 *
 * @author Himanshu Garg
 */
public class ArrangeArrray {
    public static int[] arrangeTheArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        
        // Arranging all the odd elements towards the left of the array and all the even elements towards the right
        
        while(start<end){
            if(arr[start]%2==0){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                end--;
            }
            else{
                start++;
            }
        }
        
        return arr;
    }
    
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        
        int[] answer =  arrangeTheArray(arr);
        for(int x : answer){
            System.out.print(x + " ");
        }
    }
}
