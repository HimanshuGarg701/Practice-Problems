package HashMap;

import java.util.HashMap;

public class PairSumToK {
    public static void main(String[] args){
        int[] arr = {12, 78, 24, 36, 45, 55, 76, 44};
        int k = 10;
        System.out.println(isPossibleToPair(arr, k));
    }

    public static boolean isPossibleToPair(int[] arr, int k){
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for(int i: arr){
            int remainder = i%k;
            if(frequencyMap.containsKey(remainder)){
                frequencyMap.put(remainder, frequencyMap.get(remainder)+1);
            }else{
                frequencyMap.put(remainder, 1);
            }
        }
        System.out.println(frequencyMap);

        int size = frequencyMap.size()/2 + 1;
        int count =0;
        boolean odd = false;
        if(k%2!=0)
            odd = true;
        for(int i: frequencyMap.keySet()){
            if(i==0){
                if(frequencyMap.get(i)%2!=0){
                    return false;
                }
            }else if(!odd && i==k/2){
                if(frequencyMap.get(i)%2!=0){
                    return false;
                }
            }else{
                int remaining = k-i;
                if((i+remaining)%k!=0 || frequencyMap.get(i) != frequencyMap.get(remaining)){
                    return false;
                }
            }


        }
        return true;
    }
}
