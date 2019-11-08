
package leetcode.practice;

/**
 *
 * @author Himanshu Garg
 */
public class BuyAndSell {
    public static void main(String[] args){
        int[] arr = {1,5,2,3,7,6,4,5};
        System.out.println("The maximum profit that can be earned is: " + maxProfit(arr));
    }
    
    public static int maxProfit(int[] arr){
        int profit = 0;
        int buy = 0;
        
        for(int sell = 1; sell<arr.length; sell++){
            if(arr[sell-1] > arr[sell]){
                buy = sell;
            }
            
            if(arr[sell-1] <= arr[sell] && (sell+1==arr.length || arr[sell] > arr[sell+1])){
                profit += arr[sell] - arr[buy];
                System.out.println("Bought on Day : " + (buy+1) + " and sold on : " + (sell+1));
            }
        }
        return profit;
    }
}
