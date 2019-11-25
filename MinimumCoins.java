
package leetcode.practice;
import java.util.*;
/**
 *
 * @author Himanshu Garg
 */
public class MinimumCoins {
    public static void main(String[] args){
        int[] arr = {7,6,1,2,5};
        int sum = 25;
        findMin(arr, sum);
    }
    
    public static void findMin(int[] arr, int sum){
        Arrays.sort(arr);
        int end = arr[arr.length-1];
        int numCoins = 0;
        ArrayList<String> answer = new ArrayList<>();
        int length = arr.length-1;
        while(length>=0){
            int temp = sum/end;
            numCoins += sum/end;
            answer.add("Frequency of " + end + " coins is: " + temp);
            sum = sum%end;
            length--;
            if(length>=0)
                end = arr[length];
        }
        if(sum!=0){
            System.out.println("Sorry we can't get the value");
            return;
        }
        System.out.println("Minimum number of coins required : " + numCoins);
        for(String x : answer){
            System.out.println(x);
        }
    }
}
