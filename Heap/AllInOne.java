package Heap;

import java.util.HashMap;
import java.util.PriorityQueue;

public class AllInOne {
    public static void main(String[] args){
        int[] array = {2,3,4,5,6,7,8,9,0,1};
        Integer[][] points = { {1,1},{0,1},{2,2},{0,2},{0,0} };
        int[] newArray = {1,1,1,2,2,2,3,3,3,3,4,4,4,4,4,4};
        frequentNumbers(newArray, 2);
        findKSmallest(array, 4);
        closestKNumbers(array, 4, 10);
        closestToOrigin(points, 2);
        sumSmallestAndLargest(array, 2);
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

    public static void closestToOrigin(Integer[][] arr, int k){
        HashMap<Integer[], Integer> map = new HashMap<>();
        for(Integer[] i: arr){
            map.put(i, i[0]*i[1]);
        }

        PriorityQueue<Integer[]> maxHeap = new PriorityQueue<>((a,b)-> map.get(b)-map.get(a));
        for(Integer[] j : arr){
            maxHeap.add(j);
            if(maxHeap.size()>k){
                maxHeap.poll();
            }
        }

        while(!maxHeap.isEmpty()){
            Integer[] data = maxHeap.poll();
            System.out.print("\n[ " + data[0] + " ], [ " + data[1] + " ]\n");
        }
    }

    public static void frequentNumbers(int[] arr, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: arr){
            if(!map.containsKey(i)){
                map.put(i, 1);
            }else{
                map.put(i, map.get(i)+1);
            }
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b)->map.get(a)-map.get(b));
        for(int i: arr){
            minHeap.add(i);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        System.out.println("Most Frequent Numbers: ");
        while(!minHeap.isEmpty()){
            System.out.print("  " + minHeap.poll() + "  ");
        }
        System.out.println();
    }

    public static void sumSmallestAndLargest(int[] arr, int k){
        //Adding smallest k integers with k largest integers
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->b-1);
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i: arr){
            maxHeap.add(i);
            minHeap.add(i);

            if(maxHeap.size()>k){
                maxHeap.poll();
                minHeap.poll();
            }
        }

        int sum = 0;
        while(maxHeap.size()>0){
            sum += maxHeap.poll() + minHeap.poll();
        }
        System.out.println("The sum of numbers is: " + sum);
    }
}

