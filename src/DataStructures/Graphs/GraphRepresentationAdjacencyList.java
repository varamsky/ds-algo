package DataStructures.Graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GraphRepresentationAdjacencyList {
    /**
     * Adjacency List
     *
     * Benefits:
     * 1. It takes less space as compared to the Matrix therefore less space is wasted.
     *
     * Problems:
     * 1. For all other operations it takes more time as compared to the Matrix.
     *
     * If we have a graph that is sparse, i.e, every vertex is connected to only a few other vertices(very common in most of the real-world applications) then we can use Adjacency List.
     * Otherwise, if the graph is dense then we should choose the Matrix.
     *
     * In most of the cases we should use an Adjacency List.
     */

    // we could also use List<LinkedList<Integer>>
    static List<List<Integer>> graph;

    static int v;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of vertices in the graph: ");
        v = sc.nextInt();

        // Connected, non-weighted bidirectional graph
        graph = new ArrayList<>();
        for(int i=0;i<v;i++){
            graph.add(new ArrayList<>());
        }

        addEdge(0, 1);
        addEdge(1, 2);
        addEdge(2, 3);
        addEdge(3, 1);

        System.out.println(graph.toString());
    }

    private static void addEdge(int source, int destination){
        if(source < v && destination < v) {
            // because this is bidirectional graph
            graph.get(source).add(destination);
            graph.get(destination).add(source);
        }
    }
}
