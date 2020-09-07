package Heap;

import java.util.HashMap;
import java.util.PriorityQueue;

public class AllInOne {
    public static void main(String[] args){
        int[] array = {2,3,4,5,6,7,8,9,0,1};
        findKSmallest(array, 4);
        closestKNumbers(array, 4, 10);
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

    public static void closestKNumbers(int[] arr, int k, int num){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: arr){
            map.put(i, Math.abs(i-num));
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)-> map.get(b) - map.get(a));

        for(int i: arr){
            maxHeap.add(i);
            if(maxHeap.size()>k){
                maxHeap.poll();
            }
        }
        System.out.print("Closest 4 numbers to 10: ");
        while(maxHeap.size()!=0){
            System.out.print("  " + maxHeap.poll() + "  ");
        }
    }
}

