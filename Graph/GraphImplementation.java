package Graph;

import java.util.*;

public class GraphImplementation<T> {
    private HashMap<T, LinkedList<T>> map = new HashMap();

    public void addVertex(T vertex){
        if(!map.containsKey(vertex)){
            map.put(vertex, new LinkedList<T>());
        }
    }

    public void addEdge(T begin, T end){
        if(!map.containsKey(begin)){
            addVertex(begin);
        }

        if(!map.containsKey(end)){
            addVertex(end);
        }

        map.get(begin).add(end);
    }

    public boolean hasEdge(T begin, T end){
        if(map.containsKey(begin)){
            if(map.get(begin).contains(end)){
                return true;
            }
        }
        return false;
    }

    public boolean hasVertex(T vertex){
        if(map.containsKey(vertex))
            return true;
        return false;
    }

    public String printGraph(){
        StringBuilder print = new StringBuilder();

        for(T key : map.keySet()){
            print.append(key + "--> ");
            for(T value : map.get(key)){
                print.append(value +"    ");
            }
            print.append("\n");
        }

        return print.toString();
    }
}
