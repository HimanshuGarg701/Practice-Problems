package Mix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,6,5,3,2,1};
        arr = removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] removeDuplicates(int[] arr){
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }

        int[] result = new int[list.size()];
        int count = 0;
        for(int i:list){
            result[count] = i;
            count++;
        }
        return result;
    }
}
