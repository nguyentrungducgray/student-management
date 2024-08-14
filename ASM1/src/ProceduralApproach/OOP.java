/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProceduralApproach;

import java.util.NoSuchElementException;

/**
 *
 * @author trung
 */
public class OOP {
    
    
    // OOP: Queue class with procedural methods
public class Queue {
    private int[] elements;
    private int front, rear, size;
    private static final int DEFAULT_CAPACITY = 10;
    public Queue() {
        elements = new int[DEFAULT_CAPACITY];
        front = 0;
        rear = 0;
        size = 0;
    }
    public void enqueue(int element) {
        if (size == elements.length) {
            grow();
        }
        elements[rear] = element;
        rear = (rear + 1) % elements.length;
        size++;
    }
    public int dequeue() {
        if (size == 0) throw new NoSuchElementException();
        int element = elements[front];
        front = (front + 1) % elements.length;
        size--;
        return element;
    }
    private void grow() {
        int newSize = elements.length * 2;
        int[] newElements = new int[newSize];
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[(front + i) % elements.length];
        }
        elements = newElements;
        front = 0;
        rear = size;
    }
}

}
