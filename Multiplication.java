
package leetcode.practice;

/**
 *
 * @author Himanshu GARG
 */
public class Multiplication {
    public static int[] multiplyArray(int[] arr1, int[] arr2){
        int sign  = 1;
        if(arr1[0]>0 && arr2[0]<0 ||  arr1[0]<0 && arr2[0]>0){
            sign = -1;
        }
        
        arr1[0] = Math.abs(arr1[0]);
        arr2[0] = Math.abs(arr2[0]);
    
        int[] answer = new int[arr1.length + arr2.length];
    
        for(int i=0; i<answer.length; i++){
            answer[i] = 0;
        }
    
        for(int j = arr1.length-1; j>=0; j--){
            for(int k=arr2.length-1; k>=0; k--){
                answer[j+k+1] = answer[j+k+1] + arr1[j] *arr2[k];
                answer[j+k] = answer[j+k] + answer[j+k+1]/10;
                answer[j+k+1] = answer[j+k+1]%10;
            }
        }
        int numZeros = 0;
        for(int i : answer){
            if(i!=0){
                break;
            }
            else{
                numZeros++;
            }
        }
        
        int[] answerArray = new int[answer.length - numZeros];
        int j=0;
        for(int i= numZeros; i<answer.length; i++){
            answerArray[j] = answer[i];
            j++;
        }
        
        answerArray[0] = sign * answerArray[0];
        return answerArray;
    }
    
        public static void main(String[] args){
            int[] arr1 = {2};
            int[] arr2 = {-2};
            int[] answer = multiplyArray(arr1, arr2);
            for(int i : answer){
                System.out.print(i + " ");
            }
        }
}
