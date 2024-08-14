/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

/**
 *
 * @author trung
 */
public class main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        System.out.println(queue.dequeue()); // Output: 10
        System.out.println(queue.peekFront()); // Output: 20
        queue.enqueue(50);
        queue.enqueue(60);

        // Queue is now full, so we'll dequeue some elements to make space
        while (!queue.isEmpty()) {
            System.out.print(queue.dequeue() + " "); // Output: 20 30 40 50 60
        }
    }
}
