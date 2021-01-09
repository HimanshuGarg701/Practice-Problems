package HashMap;

import java.util.HashMap;

public class FindPath {
    public static void main(String[] args){
        HashMap<String, String> map = new HashMap<>();
        map.put("San Francisco", "san diego");
        map.put("san diego", "Los Angeles");
        map.put("Los Angeles", "Las Vegas");
        map.put("Las Vegas", "New York");

        HashMap<String, Boolean> findStart = new HashMap<>();
        for(String i : map.keySet()){
            String destination = map.get(i);
            findStart.put(destination, false);
            if(!findStart.containsKey(i)){
                findStart.put(i, true);
            }
        }

        String start = "";
        for(String i: findStart.keySet()){
            if(findStart.get(i)){
                start = i;
                break;
            }
        }

        while(true){
            if(map.containsKey(start)){
                System.out.print(start + "-->");
                start = map.get(start);
            }else{
                System.out.print(start + ".");
                break;
            }
        }
    }
}
