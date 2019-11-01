
package leetcode.practice;

/**
 *
 * @author Himanshu Garg
 */
public class ReplaceNMultiply {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int[] answer = getAnswer(arr);
        
        for(int x : answer){
            System.out.print(x + " ");
        }
        System.out.println("");
    }
    
    public static int[] getAnswer(int[] arr){
        int length = arr.length;
        int[] left = new int[length];
        int[] right = new int[length];
        int[] answer = new int[length];
        left[0] = 1;
        for(int i=1; i<length; i++){
            left[i] = left[i-1] * arr[i-1];
        }
        right[length-1] = 1;
        for(int j=length-2; j>=0; j--){
            right[j] = right[j+1] * arr[j+1];
        }
        
        for(int k=0; k<length; k++){
            answer[k] = left[k] * right[k];
        }
        return answer;
    }
}
