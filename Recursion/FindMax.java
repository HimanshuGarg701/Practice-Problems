package Recursion;

public class FindMax {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,12,10};
        printMax(arr, 0, Integer.MIN_VALUE);
    }

    public static void printMax(int[] arr, int n, int max){
        if(arr.length==n){
            System.out.println("Max value is: " + max);
            return;
        }

        max = Math.max(arr[n], max);
        printMax(arr, n+1, max);
    }
}
