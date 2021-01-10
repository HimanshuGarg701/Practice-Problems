package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Recommender {
    public static void main(String[] args){
        HashMap<String, ArrayList<String>> connections = new HashMap<>();
        ArrayList<String> friends = new ArrayList<>();

        friends.add("Sarvesh");
        friends.add("Unmesh");
        friends.add("Sunny");
        connections.put("Himanshu", friends);


        ArrayList<String> friends2 = new ArrayList<>();
        ArrayList<String> friends3 = new ArrayList<>();
        ArrayList<String> friends4 = new ArrayList<>();
        friends2.add("Ashwini");
        friends2.add("Unmesh");
        friends2.add("Ponde");
        connections.put("Sarvesh", friends2);


        friends3.add("Ashwini");
        friends3.add("Tanya");
        friends3.add("Mamta");
        connections.put("Unmesh", friends3);



        friends4.add("Mamta");
        friends4.add("Tanya");
        friends4.add("Yash");
        connections.put("Sunny", friends4);


        suggestFriends("Himanshu", connections);
    }

    public static void suggestFriends(String name, HashMap<String, ArrayList<String>> connetions){
        ArrayList<String> friendsOfName = new ArrayList<String>();
        HashMap<String, Integer> map = new HashMap<>();
        PriorityQueue<String> maxHeap = new PriorityQueue<>((a,b) -> map.get(b)-map.get(a));

        if(connetions.containsKey(name)){
            friendsOfName = connetions.get(name);
            for(String i: friendsOfName){
                for(String j: connetions.get(i)){
                    if(!friendsOfName.contains(j)){
                        map.put(j, map.getOrDefault(j, 0)+1);
                    }
                }
            }
        }else{
            System.out.println("Cannot find this person");
        }
        System.out.println(map);
        for(String i : map.keySet()){
            maxHeap.add(i);
        }
        int count = 3;
        while(!maxHeap.isEmpty() && count>0){
            System.out.println(maxHeap.poll());
            count--;
        }
    }
}
