package HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class DistinctElementSizeK {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,3,2,34,5,6,7,5,3,2,4,6,6,6,6,7,9,0,4,2};
        int k = 4;
        ArrayList<Integer> list = findDistinctSizeK(arr, k);
        System.out.println(list);
    }

    public static ArrayList<Integer> findDistinctSizeK(int[] arr, int k){
        ArrayList<Integer> answer = new ArrayList<>();
        int start = 0;
        int end = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int m=0;
        while(end!=arr.length){
            map.put(arr[end], map.getOrDefault(arr[end], 0) + 1);
            m++;
            if(m==k){
                answer.add(map.size());
                int freq = map.get(arr[start]);
                if(freq==1){
                    map.remove(arr[start]);
                }else{
                    map.put(arr[start], freq-1);
                }
                start++;
                m--;
            }
            end++;
        }
        return answer;
    }
}
