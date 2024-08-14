/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayQueue;

/**
 *
 * @author trung
 */
public class ArrayQueue {
    private int maxSize;
    private int[] queueArray;
    private int front; // Front of the queue
    private int rear; // Rear of the queue
    private int nItems; // Number of items in the queue

    // Constructor
    public ArrayQueue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    // Enqueue operation
    public void enqueue(int value) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        if (rear == maxSize - 1) { // Wrap around
            rear = -1;
        }
        queueArray[++rear] = value;
        nItems++;
    }

    // Dequeue operation
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int temp = queueArray[front++];
        if (front == maxSize) { // Wrap around
            front = 0;
        }
        nItems--;
        return temp;
    }

    // Peek operation (returns the front element without dequeuing)
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queueArray[front];
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return (nItems == 0);
    }

    // Check if the queue is full
    public boolean isFull() {
        return (nItems == maxSize);
    }

    // Get the current size of the queue
    public int size() {
        return nItems;
    }
}
