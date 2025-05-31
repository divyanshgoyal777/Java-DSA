import java.util.*;

public class CycleDetection_UnDirected_Graph {
    static class Edge {
        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void addUndirectedEdge(ArrayList<Edge>[] graph, int u, int v) {
        graph[u].add(new Edge(u, v));
        graph[v].add(new Edge(v, u));
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        addUndirectedEdge(graph, 0, 1);
        addUndirectedEdge(graph, 0, 2);
        addUndirectedEdge(graph, 1, 3);
        addUndirectedEdge(graph, 2, 4);
        addUndirectedEdge(graph, 3, 4);
        addUndirectedEdge(graph, 4, 5);
        addUndirectedEdge(graph, 5, 6);
        addUndirectedEdge(graph, 6, 3); // This creates a cycle
    }

    public static boolean isCycleUndirected(ArrayList<Edge>[] graph, int curr, boolean[] visited, int parent) {
        visited[curr] = true;

        for (Edge e : graph[curr]) {
            if (!visited[e.dest]) {
                if (isCycleUndirected(graph, e.dest, visited, curr)) {
                    return true; // Cycle detected
                }
            } else if (e.dest != parent) {
                return true; // Found a back edge (cycle)
            }
        }

        return false; // No cycle found
    }

    public static void main(String[] args) {
        int V = 7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (isCycleUndirected(graph, i, visited, -1)) {
                    System.out.println("Cycle detected in the undirected graph.");
                    return;
                }
            }
        }

        System.out.println("No cycle detected in the undirected graph.");
    }
}
