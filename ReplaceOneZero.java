
package leetcode.practice;

/**
 *
 * @author Himanshu Garg
 */
public class ReplaceOneZero {
    public static void main(String[] args){
        int arr[] = {1,1,0,1,1,0,1,1,1};
        System.out.println(findRemovable(arr));
    }
    
    public static int findRemovable(int[] x){
        int count = 0;
        int last0Index = -1;
        int maxOnes = 0;
        int answerIndex = -1;
        
        for(int i=0; i<x.length; i++){
            if(x[i]==1){
                count++;
            }else{
                count = i - last0Index;
                last0Index = i;
            }
            
            if(count>maxOnes){
                maxOnes = count;
                answerIndex = last0Index;
            }
        }
        return answerIndex;
    }
}
