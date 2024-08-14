/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModularityandReusability;

import java.util.Arrays;

/**
 *
 * @author trung
 */
public class ImperativeADTs {
    // Imperative ADT: List implementation
public class List {
    private int[] items;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    public List() {
        items = new int[INITIAL_CAPACITY];
        size = 0;
    }

    public void add(int item) {
        if (size == items.length) {
            grow();
        }
        items[size++] = item;
    }

    private void grow() {
        int newSize = items.length * 2;
        items = Arrays.copyOf(items, newSize);
    }
}

}
