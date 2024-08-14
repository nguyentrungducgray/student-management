/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayQueue;

/**
 *
 * @author trung
 */
public class main {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Front element: " + queue.peek()); // Output: 10
        System.out.println("Dequeued element: " + queue.dequeue()); // Output: 10
        System.out.println("Queue size after dequeue: " + queue.size()); // Output: 2
    }
}
