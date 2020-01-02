package Heap;

import java.util.PriorityQueue;

public class SumSmallestAndLargest {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        //Sum of k1 largest and k2 smallest
        findSum(2, 3, array);

    }

    public static void findSum(int smallest, int largest, int[] array){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b-a);

        for(int i : array){
            minHeap.add(i);
            maxHeap.add(i);

            if(minHeap.size()>largest){
                minHeap.poll();
            }

            if(maxHeap.size()>smallest){
                maxHeap.poll();
            }
        }
        int sum = 0;
        while(maxHeap.size()>0){
            sum += maxHeap.poll();
        }

        while(minHeap.size()>0){
            sum += minHeap.poll();
        }

        System.out.println("The sum is: " + sum);
    }
}
