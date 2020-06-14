package BinarySearchQuestions;

public class PeakElement {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 14,13,12,11,10, 9, 7, 5, 3, 1, 0};
        findPeak(array);
    }

    private static void findPeak(int[] array){
        if(array.length==0)
            System.out.println("No Peak element");
        else if(array.length==1)
            System.out.println("Peak element: " + array[0]);
        else if(array[0] > array[1])
            System.out.println("Peak element is : " + array[0]);
        else if(array[array.length-1] > array[array.length-2])
            System.out.println("Peak element is : " + array[array.length-1]);
        else{
            int start = 0;
            int end = array.length-1;
            int mid = 0;
            while(start <=end){
                mid = start + (end-start)/2;
                int left = -1;
                int right = -1;
                if(mid-1>=0)
                    left = mid-1;

                if(mid+1 < array.length)
                    right = mid+1;

                if(array[mid] > array[left] && array[mid]>array[right]){
                    System.out.println("Peak element is : " + array[mid]);
                    break;
                }
                else if(array[mid] < array[left]){
                    end = mid-1;
                }
                else if(array[mid] < array[right]){
                    start = mid+1;
                }
            }
        }
    }
}
