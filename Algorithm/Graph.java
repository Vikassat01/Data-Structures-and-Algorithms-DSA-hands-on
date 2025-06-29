package Algorithm;

import java.util.*;

class Graph {
    static class Edge {
        int target, weight;
        Edge(int target, int weight) {
            this.target = target;
            this.weight = weight;
        }
    }

    int V;
    List<List<Edge>> adj;

    Graph(int V) {
        this.V = V;
        adj = new ArrayList<>();
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());
    }

    void addEdge(int u, int v, int w) {
        adj.get(u).add(new Edge(v, w));
    }

    void dijkstra(int src) {
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.offer(new int[]{src, 0});

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int u = current[0];

            for (Edge edge : adj.get(u)) {
                int v = edge.target;
                int weight = edge.weight;

                if (dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                    pq.offer(new int[]{v, dist[v]});
                }
            }
        }

        System.out.println("Vertex \t Distance from Source");
        for (int i = 0; i < V; i++)
            System.out.println(i + " \t\t " + dist[i]);
    }

    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0, 1, 10);
        g.addEdge(0, 2, 5);
        g.addEdge(1, 2, 2);
        g.addEdge(1, 3, 1);
        g.addEdge(2, 1, 3);
        g.addEdge(2, 3, 9);
        g.addEdge(2, 4, 2);
        g.addEdge(3, 4, 4);
        g.addEdge(4, 0, 7);
        g.addEdge(4, 3, 6);

        g.dijkstra(0); // Start from vertex 0
    }
}

//Pseudocode
//function Dijkstra(Graph, source):
//dist[source] = 0
//        for each vertex v in Graph:
//        if v ≠ source:
//dist[v] = ∞
//add v to priority queue
//
//    while priority queue is not empty:
//u = vertex with min dist[u]
//remove u from queue
//
//        for each neighbor v of u:
//alt = dist[u] + weight(u, v)
//            if alt < dist[v]:
//dist[v] = alt
//update priority queue

