/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkList;

/**
 *
 * @author trung
 */
public class main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(10);
        list.addLast(20);
        list.addLast(30);
        list.traverse(); // Output: 10 20 30
        list.addAtPosition(1, 15);
        list.traverse(); // Output: 10 15 20 30
        list.deleteFirst();
        list.traverse(); // Output: 15 20 30
        list.deleteLast();
        list.traverse(); // Output: 15 20
        list.deleteAtPosition(1);
        list.traverse(); // Output: 15
    }
}
