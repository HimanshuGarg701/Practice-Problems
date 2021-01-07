package Recursion;

public class printArray {
    public static void main(String[] args){
        int[] arr = {1,2,4,5,6};
        print(arr, 0);
    }

    public static void print(int[] arr, int n){
        if(n==arr.length){
            return;
        }

        System.out.println(arr[n]);
        print(arr, n+1);
    }
}
