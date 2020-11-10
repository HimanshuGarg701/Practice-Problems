package BinarySearchQuestions;

public class AllInOne {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println("Index of 2 is: " + findElement(2, arr));

        int[] arr2 = {1,1,1,2,2,2,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6,6};
        System.out.println("Number of times 4 appeared: " + findAppearances(arr2, 4));

        int[] arr3 = {4,5,6,7,8,1,2,3};
        System.out.println("Index of 2 in rotated array is: " + findInRotated(arr3, 2));

        findSpecifiedElement(arr3, 6);
    }

    private static int findInRotated(int[] arr, int element){
        int start = 0;
        int end = arr.length-1;
        int x=-1;
        while(start<=end){

            int pointOfRotation = findRotationPoint(arr);
            if(element==arr[pointOfRotation]){
                return pointOfRotation;
            }else{

                if(arr[arr.length-1]> element){
                    x= findElementInRotated(pointOfRotation, arr.length-1, arr, element);
                }
                else{
                    x = findElementInRotated(0, pointOfRotation, arr, element);
                }
            }
        }
        return x;
    }

    private static int findElementInRotated(int start, int end, int[] arr, int element){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==element){
                return mid;
            }else if(arr[mid]>element){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }

    private static int findRotationPoint(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        while(start<=end){
            mid = start + (end-start)/2;
            int left = (mid-1+arr.length)%arr.length;
            int right = (mid+1)/arr.length;
            if(arr[mid]<arr[left] && arr[mid]<arr[right]){
                return mid;
            }
            else if(arr[mid] > arr[end]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }

    private static int findElement(int element, int[] arr){
        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        while(start<=end){
            mid = start + (end-start)/2;
            if(arr[mid]==element){
                return mid;
            }else if(arr[mid]<element){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }

    private static int findAppearances(int[] arr, int element){
        int first = findFirst(arr, element);
        int length = 0;
        if(first!=-1){
            int last = findLast(arr, element);
            length = last-first+1;
        }
        return length;
    }

    private static int findFirst(int[] arr, int element){
        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        int first = -1;
        while(start<=end){
            mid = start + (end-start)/2;
            if(arr[mid]==element){
                first = mid;
                end = mid-1;
            }else if(arr[mid]<element){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return first;
    }

    private static int findLast(int[] arr, int element){
        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        int last = -1;
        while(start<=end){
            mid = start + (end-start)/2;
            if(arr[mid]==element){
                last = mid;
                start = mid+1;
            }else if(arr[mid]<element){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return last;
    }

    private static void findSpecifiedElement(int[] array, int element){
        int start = 0;
        int end = array.length-1;
        int mid;
        while(start<=end){
            mid = start + (end-start)/2;
            if(array[mid] < element){
                start = mid+1;
            }else if(array[mid] > element){
                end = mid - 1;
            }else{
                System.out.println("The element is present at position: " + mid);
                break;
            }
        }
    }
}
