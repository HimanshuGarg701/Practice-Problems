package Heap;

import java.util.HashMap;
import java.util.PriorityQueue;

public class FrequentKnumbers {
    public static void main(String[] args){
        int[] array = {1,1,1,1,2,2,2,2,3,3,3,3,4,5,6,6,6,6,6,6};
        int[] answer = mostOccurred(3, array);
        for(int i : answer){
            System.out.print(i + "  ");
        }
    }

    public static int[] mostOccurred(int num, int[] array){
        int[] answer = new int[num];
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b) -> map.get(a)-map.get(b));

        for(int i : array){
            if(!map.containsKey(i)){
                map.put(i, 1);
            }
            else{
                map.put(i, map.get(i) + 1);
            }
        }

        for(int i : map.keySet()){
            minHeap.add(i);
            if(minHeap.size()>num){
                minHeap.poll();
            }
        }
        int count = 0;
        while(minHeap.size()>0){
            answer[count] = minHeap.poll();
            count++;
        }

        return answer;
    }
}
