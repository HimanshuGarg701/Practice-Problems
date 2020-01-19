package Heap;

import java.util.HashMap;
import java.util.PriorityQueue;

public class ClosestToOrigin {
    public static void main(String[] args){
        Integer[][] points = {
                            {1,2},
                            {0,4},
                            {0,0},
                            {1,4,},
                            {2,2},
                            {4,1},
                            {2,0}
                         };

        findClosest(3, points);
    }

    private static void findClosest(int num, Integer[][] points){
        HashMap<Integer[], Integer> map = new HashMap<>();
        PriorityQueue<Integer[]> maxHeap = new PriorityQueue<>((a,b)-> map.get(b) - map.get(a));
        for(Integer[] i : points){
            map.put(i, (i[0]*i[0]) + (i[1]*i[1]));
        }

        for(Integer[] i : map.keySet()){
            maxHeap.add(i);
            if(maxHeap.size() > num){
                maxHeap.poll();
            }
        }
        System.out.println("Closest points ");
        while(!maxHeap.isEmpty()){
            Integer[] point = maxHeap.poll();
            System.out.print( "[" + point[0] + ", "+ point[1] + "]    ");
        }
    }
}
