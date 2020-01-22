package Heap;

import java.util.PriorityQueue;

public class KlargestElements {
    public static void main(String[] args){
        int[] array = {4,5,6,7,3,1,12,51,0,2};
        int[] result = findKLargest(4, array);

        for(int largest : result){
            System.out.print(largest + "  ");
        }
    }

    private static int[] findKLargest(int num, int[] array){
        int[] result = new int[num];
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int k = 0;
        while(k<array.length && minHeap.size()<=num){
            minHeap.add(array[k]);
            if(minHeap.size() > num){
                minHeap.poll();
            }
            k++;
        }

        for(int i=0; i<num; i++){
            result[i] = minHeap.poll();
        }
        return result;
    }
}
