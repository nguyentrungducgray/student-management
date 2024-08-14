/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LanguageTransition;

/**
 *
 * @author trung
 */
public class ImperativeADTs {
    
    
    // Imperative ADT: Simple Data Structure
public class SimpleDataStructure {
    private int[] data;

    public SimpleDataStructure(int size) {
        data = new int[size];
    }

    public void set(int index, int value) {
        data[index] = value;
    }

    public int get(int index) {
        return data[index];
    }
}

}
