
package leetcode.practice;

/**
 *
 * @author Himanshu Garg
 */
public class ArrayMultiply {
    public static int[] multiply(int[] arr1, int[] arr2){
        int[] answer = new int[arr1.length + arr2.length];
        int sign = 1;
        if((arr1[0] <0 && arr2[0]>0) || (arr1[0]>0 && arr2[0]<0)){
            sign = -1;
        }
        
        for(int k=0; k< arr1.length+arr2.length; k++){
            answer[k] = 0;
        }
        
        for(int i=arr1.length-1; i>=0; i--){
            for(int j=arr2.length-1; j>=0; j--){
                answer[i+j+1] = answer[i+j+1] + (arr1[i] * arr2[j]);
                answer[i+j] = answer[i+j] + answer[i+j+1]/10;
                answer[i+j+1] = answer[i+j+1]%10;
            }
        }
        return answer;
    }
    
    public static void main(String[] args){
        int[] arr1 = {1,2,9};
        int[] arr2 = {3,4,4};
        
        int[] answer = multiply(arr1, arr2);
        boolean print = false;
        for(int x: answer){
            if(x!=0){
                print = true;
            }
            if(print)
                System.out.print(x);
        }
        System.out.println();
    }
}
