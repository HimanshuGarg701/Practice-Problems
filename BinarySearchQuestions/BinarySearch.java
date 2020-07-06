package BinarySearchQuestions;

public class BinarySearch {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        findNum(array, 5);
        findNum(array, 11);
    }

    private static void findNum(int[] array, int num){
        int start = 0;
        int end = array.length-1;
        int mid;
        boolean found = false;
        while(start<=end){
            mid = start + (end - start)/2;
            if(num < array[mid]){
                end = mid-1;
            }
            else if(num > array[mid]){
                start = mid+1;
            }
            else{
                System.out.println("Number found: " + num);
                found = true;
                break;
            }
        }
        if(!found)
            System.out.println("Number not found : " + num);
    }
}
