/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EncapsulationandAbstraction;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 *
 * @author trung
 */
public class OOP {
    // OOP: Stack class with encapsulation
public class Stack {
    private int[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public Stack() {
        elements = new int[DEFAULT_CAPACITY];
        size = 0;
    }

    public void push(int element) {
        if (size == elements.length) {
            grow();
        }
        elements[size++] = element;
    }

    public int pop() {
        if (size == 0) throw new EmptyStackException();
        return elements[--size];
    }

    private void grow() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
}

}
