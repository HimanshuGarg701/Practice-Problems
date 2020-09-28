package BinarySearchQuestions;

public class AllInOne {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println("Index of 2 is: " + findElement(2, arr));
    }

    private static int findElement(int element, int[] arr){
        int start = 0;
        int end = arr.length;
        int mid = 0;
        while(start<=end){
            mid = start + (end-start)/2;
            if(arr[mid]==element){
                return mid;
            }else if(arr[mid]<element){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}
