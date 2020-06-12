package BinarySearchQuestions;

public class InfiniteSortedArray {
    public static void main(String[] args){
        //It is finite but solving the problem assuming the array is infinite
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        findElement(5, array);
    }

    private static void findElement(int num, int[] array){
        int start = 0;
        int end = 1;
        boolean isPresent = false;
        while(!isPresent){
            if(array[start] <= num && array[end]>=num){
                isPresent = true;
                break;
            }else{
                start = end;
                end = 2 * end;
            }
        }

        int mid = 0;
        while(start<=end){
            mid = start + (end-start)/2;
            if(array[mid] == num){
                System.out.println("Number found at index : " + mid);
                break;
            }else if(num < array[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
    }
}
