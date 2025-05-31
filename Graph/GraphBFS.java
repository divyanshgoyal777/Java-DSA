import java.util.*;

public class GraphBFS {
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

        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 1));

        graph[1].add(new Edge(1, 3));
        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 4));
        graph[2].add(new Edge(2, 0));

        graph[3].add(new Edge(3, 5));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 5));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 2));

        graph[5].add(new Edge(5, 6));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 3));

        graph[6].add(new Edge(6, 5));

    }

    public static void bfs(ArrayList<Edge> graph[], int start, int V) {
        Queue<Integer> q = new LinkedList<>();
        boolean isVisited[] = new boolean[V];

        q.add(start);
        isVisited[start] = true;

        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr + " ");

            for (Edge e : graph[curr]) {
                if (!isVisited[e.dest]) {
                    q.add(e.dest);
                    isVisited[e.dest] = true;
                }
            }
        }
    }

    public static void main(String args[]) {
        int V = 7, start = 0;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        bfs(graph, start, V);
    }
}
