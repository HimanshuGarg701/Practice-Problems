
package leetcode.practice;

/**
 *
 * @author Himanshu Garg
 */
public class LongestIncreasing {
    public static int getNum(int[] A){
        int max = 0;
        int[] record = new int[A.length];
        record[0] = 1;
        for(int i=1; i<A.length; i++){
            for(int j=0; j<A.length; j++){
                if(A[j]<A[i] && record[j] > record[i]){
                    record[i] = record[j];
                }
            }record[i]++;
        }
        for(int i=0; i<record.length; i++){
            if(max < record[i]){
                max = record[i];
            }
        }
        return max;
    }
    
    public static void main(String[] args){
        int[] arr = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15 };
        System.out.println(getNum(arr));
    }
}
