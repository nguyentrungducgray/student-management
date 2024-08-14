/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DijkstraAlgorithm;

/**
 *
 * @author trung
 */
public class main {
    public static void main(String[] args) {
       
        int V = 5; // Number of vertices
        Graph g = new Graph(V); // Create a graph with V vertices

        // Add edges to the graph
        g.addEdge(0, 1, 10);
        g.addEdge(0, 4, 5);
        g.addEdge(1, 2, 1);
        g.addEdge(1, 4, 2);
        g.addEdge(2, 3, 4);
        g.addEdge(3, 4, 9);
        g.addEdge(4, 2, 3);

        g.dijkstra(0); // Run Dijkstra's Algorithm from source node 0
    }
    
}
