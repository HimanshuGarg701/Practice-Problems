package Recursion;

public class FindAllOccurrences {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,3,4,5,3};
        int[] answer = findAll(arr, 0, 3, 0);
        for(int i: answer){
            System.out.print(i + "   ");
        }
    }

    public static int[] findAll(int[] arr, int start, int element, int frequency){
        if(start==arr.length){
            return new int[frequency];
        }

        if(arr[start]==element){
            int[] ans = findAll(arr, start+1, element, frequency+1);
            ans[frequency] = start;
            return ans;
        }else{
            int ans[] = findAll(arr, start+1, element, frequency);
            return ans;
        }
    }
}
