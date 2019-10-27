
package leetcode.practice;

/**
 *
 * @author Himanshu Garg
 */
public class findDuplicate {
    public static int returnCopy(int[] arr){
        boolean[] check = new boolean[arr.length+1];
        
        for(int i=0; i<arr.length; i++){
            if(check[arr[i]]){
                return arr[i];
            }else{
                check[arr[i]] = true;
            }
        }
        return -1;
    }
    
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        System.out.println(returnCopy(arr));
    }
}
