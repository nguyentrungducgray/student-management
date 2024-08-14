/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BellmanFordAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author trung
 */
public class Graph {
     private final int V; // Number of vertices
    private final List<Edge> edges; // List to store all edges

    // Constructor to initialize the graph
    public Graph(int V) {
        this.V = V;
        edges = new ArrayList<>();
    }

    // Inner Edge class representing an edge with a source, destination, and weight
    static class Edge {
        int src, dest, weight;

        public Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    // Method to add an edge to the graph
    public void addEdge(int src, int dest, int weight) {
        edges.add(new Edge(src, dest, weight));
    }

    // Method to implement Bellman-Ford Algorithm
    public void bellmanFord(int src) {
        int[] dist = new int[V]; // Array to store the shortest distances from the source
        Arrays.fill(dist, Integer.MAX_VALUE); // Initialize all distances as infinite
        dist[src] = 0; // Distance to the source is 0

        // Relax all edges |V| - 1 times
        for (int i = 0; i < V - 1; i++) {
            for (Edge edge : edges) {
                int u = edge.src;
                int v = edge.dest;
                int weight = edge.weight;

                // If the distance to the destination can be shortened, update it
                if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                }
            }
        }

        // Check for negative weight cycles
        for (Edge edge : edges) {
            int u = edge.src;
            int v = edge.dest;
            int weight = edge.weight;

            // If a shorter path is found, a negative weight cycle exists
            if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {
                System.out.println("Graph contains negative weight cycle");
                return;
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
