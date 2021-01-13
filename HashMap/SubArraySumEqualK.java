package HashMap;

import java.util.HashMap;

public class SubArraySumEqualK {
    public static void main(String[] args){
        int[] nums = {3, 9, -2, 4, 1, -7, 2, 6, -5, 8, -3, -7, 6, 2, 1};

        int sum = 0;
        int k = 5;
        int answer = 0;
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        freqMap.put(0,1);
        for (int num : nums) {
            sum += num;
            int rest = sum - k;
            if (freqMap.containsKey(rest)) {
                answer += freqMap.get(rest);
            }
            freqMap.put(sum, freqMap.getOrDefault(rest, 0) + 1);
        }

        System.out.println(answer);
    }
}
