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
}
