/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DijkstraAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/**
 *
 * @author trung
 */
public class Graph {
     private final int V; // Number of vertices in the graph
    private final List<List<Node>> adj; // Adjacency list to store the graph

    // Constructor to initialize the graph
    public Graph(int V) {
        this.V = V;
        adj = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>()); // Initialize each adjacency list
        }
    }

    // Inner Node class representing an edge with a target node and cost
    static class Node implements Comparable<Node> {
        public int node; // Target node
        public int cost; // Edge weight

        public Node(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }

        // Compare nodes based on cost for the priority queue
        @Override
        public int compareTo(Node other) {
            return Integer.compare(this.cost, other.cost);
        }
    }

    // Method to add an edge to the graph
    public void addEdge(int u, int v, int weight) {
        adj.get(u).add(new Node(v, weight)); // Add edge from u to v
        adj.get(v).add(new Node(u, weight)); // Add edge from v to u (for undirected graph)
    }

    // Method to implement Dijkstra's Algorithm
    public void dijkstra(int src) {
        PriorityQueue<Node> pq = new PriorityQueue<>(); // Priority queue for selecting the minimum cost node
        int[] dist = new int[V]; // Array to store the shortest distances from the source
        Arrays.fill(dist, Integer.MAX_VALUE); // Initialize all distances as infinite
        dist[src] = 0; // Distance to the source is 0
        pq.add(new Node(src, 0)); // Add the source node to the priority queue

        // Loop until the priority queue is empty
        while (!pq.isEmpty()) {
            Node current = pq.poll(); // Extract the node with the minimum distance
            int u = current.node; // Current node

            // Iterate through all adjacent nodes
            for (Node neighbor : adj.get(u)) {
                int v = neighbor.node; // Target node
                int weight = neighbor.cost; // Edge weight

                // If the new distance to the neighbor is shorter, update it
                if (dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight; // Update the distance
                    pq.add(new Node(v, dist[v])); // Add the neighbor to the priority queue with the new distance
                }
            }
        }

        printShortestPaths(dist); // Print the shortest paths from the source
    }

    // Method to print the shortest paths
    private void printShortestPaths(int[] dist) {
        System.out.println("Vertex \t\t Distance from Source");
        for (int i = 0; i < dist.length; i++) {
            System.out.println(i + " \t\t " + dist[i]); // Print each vertex and its distance from the source
        }
    }

}
