package BinarySearchQuestions;

public class numRotations {
    public static void main(String[] args){
        int[] array = {5,6,7,8,9,1,2,3,4};
        findRotationIndex(array);
    }

    private static void findRotationIndex(int[] array){
        int start = 0;
        int end = array.length-1;
        int mid;

        while(start<=end){
            mid = start + (end-start)/2;
            int left = (mid -1 + array.length) % array.length;
            int right = (mid+1)%array.length;
            System.out.println("Start is : " + array[start] + " end is: " + array[end] + " mid is: " + array[mid]);
            if(array[mid] <= array[left] && array[mid]<= array[right]){
                System.out.println("Mid is : " + array[mid]);
                System.out.println("left is : " + array[left]);
                System.out.println("right is : " + array[right]);
                System.out.println("Array is rotated " + (array.length-mid) + " times");
                break;
            }
            else if(array[mid] <= array[end]){
                end = mid-1;
            }
            
            else if(array[start] <= array[mid]){
                start = mid+1;
            }
        }
    }
}
