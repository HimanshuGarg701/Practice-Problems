package DynamicProgramming;

import java.util.Arrays;
import java.util.HashMap;

public class JobScheduling {
    public static void main(String[] args){
        int[][] intervals = { {4,6}, {2,5}, {1,3}, {7,9}, {6,7}, {5,8} };
        int[] prices = {5,6,5,4,11,2};
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] array = new int[intervals.length];
        int count = 0;
        for(int[] i:intervals){
            map.put(i[1], i[0]);
            array[count] = i[1];
            count++;
        }
        Arrays.sort(array);
        count=0;
        for(int i: array){
            int j = map.get(i);
            intervals[count][0] = j;
            intervals[count][1] = i;
            count++;
        }

        int[] result = new int[intervals.length];
        count=0;
        for(int i: prices){
            result[count] = i;
            count++;
        }
        for(int i=1; i<intervals.length; i++){
            for(int j=0; j<i; j++){
                if(intervals[i][0] >= intervals[j][1]){
                    
                    result[i] = result[j] + prices[i];
                }
            }

        }
        int max = 0;
        for(int i: result){
            max = Math.max(i, max);
        }
        System.out.println("Maximum profit is: " + max);

    }
}
