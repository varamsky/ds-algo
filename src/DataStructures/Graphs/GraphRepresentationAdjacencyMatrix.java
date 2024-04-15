package DataStructures.Graphs;

import java.util.Arrays;
import java.util.Scanner;

public class GraphRepresentationAdjacencyMatrix {
    /**
     * Adjacency Matrix
     *
     * Benefits:
     * 1. With this we can perform all the operations like looking if a vertex is connected to another or not, very quickly
     *
     * Problems:
     * 1. It takes a lot of space, most of which is useless as it is filled with zero.
     *
     * If we have a graph that is very dense, i.e, every vertex is connected to many other vertices then we can use Matrix.
     * Otherwise, like in most of the cases the graph is not that dense and one vertex is connected to only a few other vertices.
     * Therefore, in most of the cases we should use an Adjacency List.
     */

    static int[][] graph;
    static int v;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of vertices in the graph: ");
        v = sc.nextInt();

        // Connected, non-weighted bidirectional graph
        graph = new int[v][v];
        addEdge(graph, 0, 1);
        addEdge(graph, 1, 2);
        addEdge(graph, 2, 3);
        addEdge(graph, 3, 1);

        System.out.println(Arrays.deepToString(graph));
    }

    private static void addEdge(int[][] graph, int source, int destination){
        if(source < v && destination < v){
            // because this is bidirectional
            graph[source][destination] = 1;
            graph[destination][source] = 1;
        }
    }
}
