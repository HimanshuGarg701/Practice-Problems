package Matrix;

import java.util.*;
/**
 *
 * @author Himanshu Garg
 */
public class makeSpiral {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
        
        int[][] result = makeMatrix(arr, 5, 5);
        
        for(int[] x : result){
            System.out.println(Arrays.toString(x));
        }
    }
    
    public static int[][] makeMatrix(int[] arr, int rows, int cols){
        int[][] answer = new int[rows][cols];
        int index = 0;
        int top = 0;
        int bottom = rows-1;
        int right = cols-1;
        int left = 0;
        
        while(true){
            if(left>right){
                break;
            }
            
            for(int i=left; i<=right; i++){
                answer[top][i] = arr[index];
                index++;
            }
            
            top++;
            
            if(top>bottom){
                break;
            }
            
            for(int i=top; i<=bottom; i++){
                answer[i][right] = arr[index];
                index++;
            }
            
            right--;
            
            if(left>right){
                break;
            }
            
            for(int i=right; i>=left; i--){
                answer[bottom][i] = arr[index];
                index++;
            }
            bottom--;
            
            if(top>bottom){
                break;
            }
            
            for(int i = bottom; i>=top; i--){
                answer[i][left] = arr[index];
                index++;
            }
            left++;
        }
        return answer;
    }
}
