
package leetcode.practice;

/**
 *
 * @author Himanshu Garg
 */
public class MaximunProduct {
    public static void main(String[] args){
        int[] arr = {-4,5,3,6,-10};
        System.out.println(findProduct(arr));
    
    }
    
    public static int findProduct(int[] arr){
        int max1 = arr[0];
        int max2 = Integer.MIN_VALUE;
        int min1 = arr[0];
        int min2 = Integer.MAX_VALUE;
        
        for(int i=1; i<arr.length; i++){
            if(max1 > arr[i]){
                max2 = max1;
                max1 = arr[i];
            }else if(max2<arr[i]){
                max2 = arr[i];
            }
            
            if(min1<arr[i]){
                min2 = min1;
                min1 = arr[i];
            }
            else if(min2>arr[i]){
                min2 = arr[i];
            }
        }
        return Math.max(max1*max2 , min1*min2);
    }
    
    
}
