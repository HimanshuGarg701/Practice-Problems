package Heap;

import java.util.HashMap;
import java.util.PriorityQueue;

public class ClosetKNumbers {
    public static void main(String[] args){
        int[] array = {2,5,6,7,4,9,14};
        int range = 3;
        //Finding 3 closest  numbers to 12
        int[] result = findClosest(12, range, array);
        for(int i : result){
            System.out.print(i +"  ");
        }
    }

    private static int[] findClosest(int num, int range, int[] array){
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
        int[] answer = new int[range];

        for(int i=0; i<array.length; i++){
            map.put(array[i], Math.abs(num-array[i]));
        }

        for(int i : map.keySet()){
            maxHeap.add(i);
            if(maxHeap.size()>range){
                maxHeap.poll();
            }
        }
        int counter=0;
        while(maxHeap.size()>0){
            answer[counter] = maxHeap.poll();
            counter++;
        }
        return answer;
    }
}
