package BinarySearchQuestions;

public class FirstPositionOfElement {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5,5,5,6,7,8,9,10};
        firstPosition(array, 5);
    }

    private static void firstPosition(int[] array, int num){
        int start = 0;
        int end = array.length-1;
        int mid;
        int result = -1;
        while(start<=end){
            mid = start + (end-start)/2;
            if(num < array[mid]){
                end = mid-1;
            }
            else if(num > array[mid]){
                start = mid+1;
            }
            else{
                result = mid;
                end = mid-1;
            }
        }
        System.out.println("First occurrence of "+ num + " is at index " + result);
    }
}
