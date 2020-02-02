package BinarySearchQuestions;

public class SearchNearlySorted {
    public static void main(String[] args){
        int[] array = {1,2,3,5,4,6};
        findElement(array, 5);
    }

    //[1,3,2,4,5,6,7,8]

    private static void findElement(int[] array, int num){
        int start = 0;
        int end = array.length-1;

        if(array[start] == num)
            System.out.println("Element present at: " + start);
        else if(array[end] == num){
            System.out.println("Element present at: " + end);
        }else{
            start = 1;
            end -= 1;
            int mid;
            while(start<=end){
                mid = start + (end-start)/2;
                int left = array[mid-1];
                int right = array[mid+1];
                if(array[mid] == num){
                    System.out.println("Element at : " + mid);
                    break;
                }
                else if(num == array[left]){
                    System.out.println("Element at : " + left);
                    break;
                }
                else if(num == array[right]){
                    System.out.println("Element at : " + right);
                    break;
                }
                else if(num < array[mid]){
                    end = mid - 1;
                }
                else if(num > array[mid]){
                    start = mid+1;
                }
            }
        }
    }
}
