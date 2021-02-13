package Heap;

import java.util.PriorityQueue;
import java.util.Queue;

public class KSmallestElements {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,7,6,5,8,9};
        findKSmallest(arr, 3);
        findKLargest(arr, 3);
    }

    private static void findKSmallest(int[] array, int k){
        Queue<Integer> maxHeap = new PriorityQueue<>((a, b)-> b-a);
        for(int i: array){
            maxHeap.add(i);
        }
        int count = 0;
        System.out.println("Printing k smallest elements");
        while(maxHeap.size()>0 && count<k){
            System.out.println(maxHeap.poll());
            count++;
        }
    }

    private static void findKLargest(int[] array, int k){
        Queue<Integer> minHeap = new PriorityQueue<>();
        for(int i: array){
            minHeap.add(i);
        }
        int count = 0;
        System.out.println("\n\nPrinting k largest elements");
        while(minHeap.size()>0 && count<k){
            System.out.println(minHeap.poll());
            count++;
        }
    }
}
