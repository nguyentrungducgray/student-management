/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LanguageTransition;

/**
 *
 * @author trung
 */
public class OOP {
    
    
    // OOP: Data Structure with Object-Oriented Features
public class DataStructure {
    private int[] data;

    public DataStructure(int size) {
        data = new int[size];
    }

    public void set(int index, int value) {
        data[index] = value;
    }

    public int get(int index) {
        return data[index];
    }

    public void printAll() {
        for (int value : data) {
            System.out.println(value);
        }
    }
}

}
