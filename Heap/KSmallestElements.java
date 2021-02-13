package Heap;

import java.util.PriorityQueue;
import java.util.Queue;

public class KSmallestElements {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,7,6,5,8,9};
        findKSmallest(arr, 3);
    }

    private static void findKSmallest(int[] array, int k){
        Queue<Integer> maxHeap = new PriorityQueue<>((a, b)-> b-a);
        for(int i: array){
            maxHeap.add(i);
        }
        int count = 0;
        while(maxHeap.size()>0 && count<k){
            System.out.println(maxHeap.poll());
            count++;
        }
    }
}
