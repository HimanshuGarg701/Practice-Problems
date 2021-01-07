package Recursion;

public class firstOccurrence {
    public static void main(String[] args){
        int[] arr = {1,4,5,6,7,8,6,5,4};
        System.out.println("Element present at index: " + findFirstOccurrence(arr, 0, 6));
    }

  public static int findFirstOccurrence(int[] arr, int n, int element){
        if(n==arr.length){
            System.out.println("Not found");
            return -1;
        }
        if(arr[n]==element){
            System.out.println("The index of element is: " + n);
            return n;
        }
        return findFirstOccurrence(arr, n+1, element);
  }


}
