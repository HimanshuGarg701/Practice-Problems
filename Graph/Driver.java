package Graph;

public class Driver {
    public static void main(String[] args){
        GraphImplementation graph = new GraphImplementation();
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);

        graph.addEdge(1,5);
        graph.addEdge(2,3);
        graph.addEdge(3,6);
    }
}
