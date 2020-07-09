package BinarySearchQuestions;

public class FindElementInRotatedArr {
    public static void main(String[] args){
        int[] array = {5,6,7,8,9,1,2,3,4};
        find(array, 7);
    }

    private static void find(int[] array, int num){
        int start = 0;
        int end = array.length-1;
        int mid;

        while(start<=end){
            mid = start + (end-start)/2;
            int left = (mid-1+array.length)%array.length;
            int right = (mid+1)%array.length;

            if(array[mid]<array[left] && array[mid]<array[right]){
                System.out.println("smallest: " + array[mid]);
                isPresent(mid, 0, array.length-1, array, num);
                break;
            }
            else if(array[mid] > array[end]){
                start = mid+1;
            }
            else if(array[start] < array[mid]){
                end = mid-1;
            }
        }
    }

    private static void isPresent(int mid, int start, int end, int[] array, int num){
        if(array[start] <= num && array[mid] >= num ){
            end = mid;
        }
        else if(array[mid]< num && array[end] >=num){
            start = mid;
        }
        int middleElement;
        while(start<=end){
            middleElement = start + (end-start)/2;
            if(array[middleElement]==num){
                System.out.println("Element present at index: " + middleElement);
                break;
            }
            else if(array[middleElement] <= num){
                start = middleElement+1;
            }
            else if(array[middleElement]>num){
                end = mid-1;
            }

        }
    }
}
