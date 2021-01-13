package HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class AnagramMapping {
    public static void main(String[] args){
        int[] arrOne = {2,7,9,2,8,1,1,3,9};
        int[] arrTwo = {3,1,2,9,8,1,7,9,2};

        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        for(int i=0; i<arrOne.length; i++){
            int num = arrOne[i];
            if(map.containsKey(num)){
                map.get(num).add(i);
            }else{
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(num, list);
            }
        }

        int[] answer = new int[arrOne.length];
        int count = 0;
        for(int i=0; i<arrTwo.length; i++){
            int num = arrTwo[i];
            if(map.containsKey(num)){
                answer[count] = map.get(num).get(0);
                count++;
                map.get(num).remove(0);
            }
        }

        System.out.println(Arrays.toString(answer));
    }
}
