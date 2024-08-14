/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BellmanFordAlgorithm;

/**
 *
 * @author trung
 */
public class main {
    public static void main(String[] args) {
        int V = 5; // Number of vertices
        Graph g = new Graph(V); // Create a graph with V vertices

        // Add edges to the graph
        g.addEdge(0, 1, -1);
        g.addEdge(0, 2, 4);
        g.addEdge(1, 2, 3);
        g.addEdge(1, 3, 2);
        g.addEdge(1, 4, 2);
        g.addEdge(3, 2, 5);
        g.addEdge(3, 1, 1);
        g.addEdge(4, 3, -3);

        g.bellmanFord(0); // Run Bellman-Ford Algorithm from source node 0
    }
}
