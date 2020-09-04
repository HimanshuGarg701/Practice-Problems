package Heap;

import java.util.PriorityQueue;

public class AllInOne {
    public static void main(String[] args){
        int[] array = {2,3,4,5,6,7,8,9,0,1};
        findKSmallest(array, 4);
    }

    public static void findKSmallest(int[] arr, int k){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b-a);

        for(int i=0; i<arr.length; i++){
            maxHeap.add(arr[i]);
            if(maxHeap.size()>k){
                maxHeap.poll();
            }
        }

        System.out.println(maxHeap.peek());
    }
}
