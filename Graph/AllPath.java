import java.util.ArrayList;

public class AllPath {
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
    }

    public static void findAllPaths(ArrayList<Edge> graph[], int curr, int dest, boolean visited[], String path) {
        if (curr == dest) {
            System.out.println(path);
            return;
        }

        visited[curr] = true;

        for (Edge e : graph[curr]) {
            if (!visited[e.dest]) {
                findAllPaths(graph, e.dest, dest, visited, path + " -> " + e.dest);
            }
        }

        visited[curr] = false; // Backtrack
    }
    public static void main(String args[]) {
        int V = 7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        boolean visited[] = new boolean[V];
        int start = 0; // Starting node
        int end = 6; // Destination node
        findAllPaths(graph, start, end, visited, String.valueOf(start));
    }
}