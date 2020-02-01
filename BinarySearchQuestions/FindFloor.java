package BinarySearchQuestions;

public class FindFloor {
    public static void main(String[] args){
        int[] array = {2,4,6,8,10,12,14};
        floor(array, 7);
    }

    private static void floor(int[] array, int num){
        int start = 0;
        int end = array.length-1;
        int mid;

        while(start<=end){
            mid = start + (end-start)/2;
            if(array[mid]==num){
                System.out.println("Floor of element is: " + array[mid]);
                break;
            }else if(array[mid] < num){
                start = mid+1;
            }else if(array[mid] > num){
                end = mid-1;
            }else{
                System.out.println("Something went wrong");
            }
        }

        try{
            System.out.println("Floor of element is: " + array[end]);
        }catch(Exception e){
            System.out.println("Size of array is zero");
        }
    }
}
