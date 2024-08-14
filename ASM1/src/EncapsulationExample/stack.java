/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EncapsulationExample;

/**
 *
 * @author trung
 */


public class stack {
    private int maxSize;
    private int[] stackArray;
    private int top; // Index of the top element
    // Constructor
    public stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // Stack is initially empty
    }
    // Push operation
    public void push(int value) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full");
        }
        stackArray[++top] = value;
    }
    // Pop operation
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stackArray[top--];
    }
    // Peek operation
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stackArray[top];
    }
    // Check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }
    // Check if the stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }
}
    
    

