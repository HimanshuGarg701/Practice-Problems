package Recursion;

public class ReversePrintArray {
    public static void main(String[] args){
        int[] arr = {1,4,5,6,8,9};
        reversePrint(arr, 0);
    }

    public static void reversePrint(int[] arr, int n){
        if(n==arr.length){
            return;
        }

        reversePrint(arr, n+1);
        System.out.println(arr[n]);
    }
}
