package Recursion;

public class firstOccurrence {
    public static void main(String[] args){
        int[] arr = {1,4,5,6,7,8,6,5,4};
        findFirstOccurrence(arr, arr.length-1, 6, -1);
    }

  public static void findFirstOccurrence(int[] arr, int n, int element, int index){
        if(n==-1){
            System.out.println("The index of element is: " + index);
            return;
        }

        if(arr[n]==element){
            index = n;
        }
        findFirstOccurrence(arr, n-1, element, index);
  }


}
