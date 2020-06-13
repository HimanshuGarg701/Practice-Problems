package BinarySearchQuestions;

public class MinimumDifference {
    public static void main(String[] args){
        int[] array = {1,3,5,6,7,8,12,14,15,19};
        findClosest(8, array);
    }

    private static void findClosest(int num, int[] array){
        int start = 0;
        int end = array.length-1;

        int mid = 0;
        while(start<=end){
            mid = start + (end-start)/2;
            if(array[mid] == num){
                System.out.println("Closest element is " + num + " with a difference of 0");
                return;
            }
            else if(array[mid] < num){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        int firstChoice = array[start] - num;
        int secondChoice = num - array[end];

        if(firstChoice <= secondChoice)
            System.out.println("Closest element is " + array[start]);
        else{
            System.out.println("Closest element is " + array[end]);
        }
    }
}
