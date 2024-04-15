package DataStructures.Graphs;

import java.util.*;

public class BFS {
    static List<List<Integer>> graph;

    static int v = 4;

    private static void bfs(int vertex, boolean[] visited){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(vertex);

        while(!queue.isEmpty()){
            vertex = queue.poll();

            if(visited[vertex]) continue;

            visited[vertex] = true;
            System.out.print(vertex + "->");

            for(int neighbour: graph.get(vertex)){
                if(!visited[neighbour]) queue.add(neighbour);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Connected, non-weighted bidirectional graph
        graph = new ArrayList<>();
        for(int i=0;i<v;i++){
            graph.add(new ArrayList<>());
        }

        addEdge(0, 1);
        addEdge(0, 3);
        addEdge(1, 2);
        addEdge(2, 3);
        addEdge(3, 1);

        System.out.println(graph.toString());

        boolean[] visited = new boolean[v];

        // here we start the traversal from 0 but one can start from where-ever they want
        bfs(0, visited);
    }

    private static void addEdge(int source, int destination){
        if(source < v && destination < v) {
            // because this is bidirectional graph
            graph.get(source).add(destination);
            graph.get(destination).add(source);
        }
    }
}
