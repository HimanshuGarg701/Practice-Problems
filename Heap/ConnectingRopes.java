package Heap;

import java.util.PriorityQueue;

public class ConnectingRopes {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5};
        //Find minimum cost to join the ropes
        findCost(array);
    }

    private static void findCost(int[] array){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i : array){
            minHeap.add(i);
        }
        int length =0;
        int cost = 0;
        while ((minHeap.size()>1)){
            int removeFirst = minHeap.poll();
            int removeSecond = minHeap.poll();
            length = removeFirst + removeSecond;
            cost += length;
            minHeap.add(length);
        }

        System.out.println("Cose is : " + cost);
    }
}
