package Recursion;

public class SubSubsets {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int target = 5;
        findSubsets(arr, target, 0, 0, "");
    }

    public static void findSubsets(int[] arr, int target, int index, int sum, String result){
        if(index==arr.length){
            if(sum==target){
                System.out.println(result);
            }
            return;
        }

        findSubsets(arr, target, index+1, sum+arr[index], result+" " + arr[index]);
        findSubsets(arr, target, index+1, sum, result);
    }
}
