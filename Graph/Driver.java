package Graph;

public class Driver {
    public static void main(String[] args){
        GraphImplementation graph = new GraphImplementation();
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);

        graph.addEdge(1,5);
        graph.addEdge(1,6);
        graph.addEdge(2,3);
        graph.addEdge(3,6);

        System.out.println("The graph contains vertex 5? : " + graph.hasVertex(5));
        System.out.println("The graph contains vertex 8? : " + graph.hasVertex(8));

        System.out.println("The graph contains edge 1->5? : " + graph.hasEdge(1,5));
        System.out.println("The graph contains edge 1->6? : " + graph.hasEdge(1,6));

        System.out.println("--------------------PRINT GRAPH--------------------------");
        System.out.println(graph.printGraph());
    }
}
