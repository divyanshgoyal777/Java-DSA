import java.util.*;

public class CycleDetection_Directed_Graph {

    static class Edge {
        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 4));
        graph[3].add(new Edge(3, 4));
        graph[4].add(new Edge(4, 5));
        graph[5].add(new Edge(5, 6));
        graph[6].add(new Edge(6, 3)); // This creates a cycle
    }

    public static boolean isCycleDirected(ArrayList<Edge> graph[], int curr, boolean visited[], boolean recStack[]) {
        visited[curr] = true;
        recStack[curr] = true;

        for (Edge e : graph[curr]) {
            if (recStack[e.dest]) {
                return true; // Cycle detected
            } else if (!visited[e.dest]) {
                if(isCycleDirected(graph, e.dest, visited, recStack)) {
                    return true; // Cycle detected in the recursive call
                }
            }
        }
        recStack[curr] = false; // Backtrack
        return false; // No cycle found in this path
    }

    public static void main(String args[]) {
        int V = 7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        boolean visited[] = new boolean[V];
        boolean recStack[] = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (isCycleDirected(graph, i, visited, recStack)) {
                    System.out.println("Cycle detected in the directed graph.");
                    return;
                }
            }
        }
        System.out.println("No cycle detected in the directed graph.");
    }
}