package Mix;

import java.util.HashMap;

public class PairSum {
    public static void main(String[] args){
        int num = 8;
        int[] allNums = {2,4,5,7,1};
        checkPair(num, allNums);
    }

    public static void checkPair(int num, int[] allNums){
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i:allNums){
            map.put(i, count);
            count++;
        }
        count=0;
        for(int i: allNums){
            int required = num - i;
            if(map.containsKey(required) && map.get(required)!=count){
                System.out.println("Pair is: " + i + " and " + required);
                break;
            }
            count++;
        }
    }
}
