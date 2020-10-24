package DynamicProgramming;

import java.util.Arrays;

public class LongestIncreasing {
    public static void main(String[] args){
        int[] nums = {3, 4, -1, 0, 6, 2, 3};
        System.out.println("The longest sequence: " + findLongestSeq(nums));
    }

    public static int findLongestSeq(int[] nums){
        int[] store = new int[nums.length];
        for(int i=0; i<store.length; i++){
            store[i] = 1;
        }

        for(int i=1; i<nums.length; i++){
            for(int j=0; j<i; j++){
                if(nums[j]<nums[i]){
                    store[i] = Math.max(store[j]+1, store[i]);
                }
            }
        }
        int max = store[0];
        for(int i=1; i<store.length; i++){
            max = Math.max(max, store[i]);
        }
        System.out.println(Arrays.toString(store));
        return max;
    }
}
