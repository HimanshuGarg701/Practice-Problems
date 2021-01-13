package HashMap;

import java.util.HashSet;

public class MaxLenContiguousSubArray {
    public static void main(String[] args){
        int[] arr = {1,2,4,5,6,76,45,22,22,23,25,24,27,26,30};

        int maxLen =0;
        int start = 0;

        for(int i=0; i<arr.length; i++){
            int min = arr[i];
            int max = arr[i];
            HashSet<Integer> set = new HashSet<>();
            set.add(arr[i]);
            for(int j=i+1; j<arr.length; j++){
                if(set.contains(arr[j])){
                    break;
                }
                min = Math.min(min, arr[j]);
                max = Math.max(max, arr[j]);
                if(max-min==j-i){
                    if(maxLen<max-min+1){
                        start = i;
                    }
                    maxLen = Math.max(maxLen, max-min+1);
                }
            }
        }

        for(int i=start; i<start+maxLen; i++){
            System.out.println(arr[i] + "  ");
        }
    }
}
