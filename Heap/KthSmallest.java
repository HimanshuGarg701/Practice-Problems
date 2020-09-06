package Heap;

import java.util.PriorityQueue;

public class KthSmallest {
    public static void main(String[] args){
        int[] array = {9,7,15,14,19,21,23,6,3,12,27,34};
        //Find 3rd smallest 
        findElement(3, array);
    }

    private static void findElement(int num, int[] array){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b-a);
        int k=0;
        while(maxHeap.size()<=num && k<array.length){
            maxHeap.add(array[k]);
            if(maxHeap.size()==num+1){
                maxHeap.poll();
            }
            k++;
        }
        System.out.println("The " + num + " th smallest element is " + maxHeap.peek());
    }
}
