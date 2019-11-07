
package leetcode.practice;

/**
 *
 * @author Himanshu Garg
 */
public class maxWater {
    public static void main(String[] args){
        int[] arr = {7,0,4,2,5,0,6,4,0,5};
        System.out.println("The maximum water that we can store : "+maximumWater(arr));
    }
    
    public static int maximumWater(int[] arr){
        int water = 0;
        int leftMax = arr[0];
        int rightMax = arr[arr.length-1];
        int left = 0;
        int right = arr.length-1;
        
        while(left < right){
            if(arr[left]<=arr[right]){
                left++;
                leftMax = Math.max(leftMax, arr[left]);
                water += leftMax - arr[left];
            }else{
                right--;
                rightMax = Math.max(rightMax, arr[right]);
                water += rightMax - arr[right];
            }
        }
        return water;
    }
}
