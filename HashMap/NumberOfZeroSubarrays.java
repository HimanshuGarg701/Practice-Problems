package HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class NumberOfZeroSubarrays {
    public static void main(String[] args){
        int[] arr = {1,2,3,-5, 1, -1};
        System.out.println("Number of sub Arrays with sum 0 is: " + findNumber(arr));
    }

    public static int findNumber(int[] arr){
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        int sum = 0;
        map.put(sum, -1);
        int answer = 0;

        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(map.containsKey(sum)){
                answer += map.get(sum);
                map.put(sum, map.get(sum)+1);
            }else{
                map.put(sum, 1);
            }
        }
        System.out.println(map);
        return answer;
    }
}
