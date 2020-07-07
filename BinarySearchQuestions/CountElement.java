package BinarySearchQuestions;

public class CountElement {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7,9,9,9,9};
        countOccurrences(array, 9);
    }

    private static void countOccurrences(int[] array, int num){
        int start = 0;
        int end = array.length-1;
        int first = firstOccurrence(start, end, array, num);
        if(first==-1){
            System.out.println("The number of Occurrences : 0" );
        }
        else {
            int last = lastOccurrence(start, end, array, num);
            System.out.println("The number of occurrences: " + (last-first+1));
        }
    }

    private static int firstOccurrence(int start, int end, int[] array, int num){
        int mid;
        int result = -1;
        while(start<=end){
            mid = start + (end-start)/2;
            if(num < array[mid]){
                end = mid-1;
            }
            else if(num>array[mid]){
                start = mid+1;
            }
            else{
                result = mid;
                end = mid-1;
            }
        }
        return result;
    }

    private static int lastOccurrence(int start, int end, int[] array, int num){
        int mid;
        int result = -1;
        while(start<=end){
            mid = start + (end-start)/2;
            if(num < array[mid]){
                end = mid-1;
            }
            else if(num>array[mid]){
                start = mid+1;
            }
            else{
                result = mid;
                start = mid+1;
            }
        }
        return result;
    }
}
