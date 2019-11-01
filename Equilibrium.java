
package leetcode.practice;

/**
 *
 * @author Himanshu Garg
 */
public class Equilibrium {
    public static void main(String[] args){
        int[] x = {1,2,3,4,6,0,0};
        
        System.out.println("Index of EQM is : " + findEqmPt(x));
    }
    
    public static int findEqmPt(int[] x){
        int sum = 0;
        
        for(int i : x){
            sum += i;
        }
        int subSum = 0;
        for(int i=0; i<x.length-1; i++){
            subSum += x[i];
            if(sum - subSum-x[i+1] == subSum){
                return i+1;
            }
        }
        return -1;
    }
}
