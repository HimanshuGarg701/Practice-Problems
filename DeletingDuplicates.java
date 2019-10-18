
package leetcode.practice;

/**
 *
 * @author Himanshu Garg
 */
public class DeletingDuplicates {
    public static int[] removeCopies(int[] arr){
        int lastVal = arr[arr.length-1];
        int start=1;
        for(int i=1; i<arr.length; i++){
            if(arr[start-1]!=arr[i]){
                arr[start] = arr[i];
                start++;
            }
        }
        int j = 0;
        for(int i: arr){
            j++;
            
            if(i==lastVal){
               break;
            }   
        }
        int[] answer = new int[j];
        for(int i = 0; i<j; i++){
            answer[i] = arr[i]; 
        }
        
        return answer;
    }
    
    public static void main(String[] args){
        int arr[] = {1,1,2,2,3,4,5,6,7,7,8,8,8,9};
        for(int x : removeCopies(arr)){
            System.out.println(x);
        }
    }
}
