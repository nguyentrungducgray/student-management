
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author trung
 */

public class StudentLinkedList {
    private Node head;
    private int size;

    public StudentLinkedList() {
        this.head = null;
        this.size = 0;
    }

    // Node class
    private static class Node {
        Student data;
        Node next;

        Node(Student data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add a student to the end of the list
    public void add(Student data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    // Get student at specified index
    public Student get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    // Update student data
    public boolean update(String id, Student newData) {
        Node current = head;
        while (current != null) {
            if (current.data.getId().equals(id)) {
                current.data.setName(newData.getName());
                current.data.setAge(newData.getAge());
                current.data.setGpa(newData.getGpa());
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Delete student by ID
    public boolean delete(String id) {
        if (head == null) {
            return false;
        }
        if (head.data.getId().equals(id)) {
            head = head.next;
            size--;
            return true;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data.getId().equals(id)) {
                current.next = current.next.next;
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Print student list
    public void printList() {
        Node current = head;
        System.out.println("Student list");
        System.out.printf("%-12s%-15s%-9s%-7s%-12s", "ID", "Name", "Age", "GPA", "Ranking");
        System.out.println("");
        while (current != null) {
            System.out.println(current.data.toString());
            current = current.next;
        }
    }

    // Return the size of the list
    public int size() {
        return size;
    }

    // Sort students by GPA using Merge Sort
    public void sortByGPA() {
        head = mergeSort(head);
    }

    private Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node middle = getMiddle(head);
        Node nextOfMiddle = middle.next;
        middle.next = null;

        Node left = mergeSort(head);
        Node right = mergeSort(nextOfMiddle);

        return sortedMerge(left, right);
    }

    private Node getMiddle(Node head) {
        if (head == null) {
            return head;
        }
        Node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node sortedMerge(Node left, Node right) {
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }
        Node result;
        if (left.data.getGpa() <= right.data.getGpa()) {
            result = left;
            result.next = sortedMerge(left.next, right);
        } else {
            result = right;
            result.next = sortedMerge(left, right.next);
        }
        return result;
    }
    
    // Search student by ID
    public Student searchById(String id) {
        Node current = head;
        while (current != null) {
            if (current.data.getId().equals(id)) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }
}
