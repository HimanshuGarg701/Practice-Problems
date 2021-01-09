package HashMap;

import java.util.HashMap;

public class SubarrayWithZeroSum {
    public static void main(String[] args){
        int[] arr = {1,2,3,-5, 3, 5, 7, 3, -10, 2, -10, 3, 4};
        System.out.println("Max length is: " + findMaxLen(arr));
    }

    public static int findMaxLen(int[] arr){
        int sum = 0;
        int i = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(sum, i);
        int maxLen = 0;

        for(int j=0; j<arr.length; j++){

            sum += arr[j];
            if(map.containsKey(sum)){
                maxLen = Math.max(maxLen, j-map.get(sum));
            }else{
                map.put(sum, j);
            }
        }
        return maxLen;
    }
}
