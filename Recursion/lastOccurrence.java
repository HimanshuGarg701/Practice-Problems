package Recursion;

public class lastOccurrence {
    public static void main(String[] args){
        int[] arr = {1,3,4,5,6,3,5};
        findLastIndex(arr, 3, 0, -1);
    }

    public static void findLastIndex(int[] arr, int element, int start, int index){
        if(arr.length==start){
            System.out.println("The element is present at "+ index);
            return;
        }

        if(arr[start]==element)
            index = start;

        findLastIndex(arr, element, start+1, index);
    }
}
