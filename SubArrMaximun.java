
package leetcode.practice;

/**
 *
 * @author rgarg
 */
public class SubArrMaximun {
    
    public static int maxSubArray(int[] nums) {
        int subSum = nums[0];
        int sum = nums[0];
        for(int i=1; i<nums.length; i++){
            subSum = Math.max(nums[i], (subSum + nums[i]));
            sum = Math.max(sum, subSum);
        }
        return sum;
    }
    
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(maxSubArray(arr));
            
        }
    }


