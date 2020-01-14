package Heap;

import java.util.PriorityQueue;

public class SortKsorted {
    public static void main(String[] args){
        int[] array = {7,6,4,3,9,11,10};
        //Element is present within 3 indices ahead or before of exact position
        int[] sortedArray = sort(3, array);
        for(int i : sortedArray){
            System.out.print(i + "  ");
        }
    }

    private static int[] sort(int num,int[] array){
        int[] answer = new int[array.length];
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int k=0;
        int counter = 0;
        while(k<array.length){
            minHeap.add(array[k]);
            if(minHeap.size()>num){
                answer[counter] = minHeap.poll();
                counter++;
            }
            k++;
        }
        while(minHeap.size()>0){
            answer[counter] = minHeap.poll();
            counter++;
        }
        return answer;
    }
}
