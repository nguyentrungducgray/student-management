/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asm2;

import java.util.Scanner;

/**
 *
 * @author trung
 */
public class StudentManagementApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       StudentManager sm = new StudentManager();
        Scanner sc = new Scanner(System.in);
        int choose;
        do {
            showMenu();
            choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1 -> sm.printStudentList();
                case 2 -> sm.addStudent();
                case 3 -> sm.editStudent();
                case 4 -> sm.deleteStudent();
                case 5 -> sm.sortStudentsByGPA();
                case 6 -> sm.sortStudentsByGPA1();
                case 7 -> sm.searchStudentById();
                case 8 -> sm.searchStudentById1();
                case 9 -> System.out.println("Goodbye!");
                default -> {
                    System.out.println("The function you chose does not exist!");
                    System.out.println("Please choose again!");
                }
            }
        } while (choose != 9);
    }

    public static void showMenu() {
        System.out.println("\n==============================");
        System.out.println("          MAIN MENU           ");
        System.out.println("==============================");
        System.out.println("Student Management");
        System.out.println("Function list");
        System.out.println("1. Display student list");
        System.out.println("2. Add new student");
        System.out.println("3. Edit student");
        System.out.println("4. Delete student");
        System.out.println("5. Sort students by GPA (Bubble Sort)");
        System.out.println("6. Sort students by GPA (Quick Sort)");
        System.out.println("7. Search by ID (Linear Search)");
        System.out.println("8. Search by ID (Binary Search)");
        System.out.println("9. Exit program");
        System.out.print("Your choice?: ");
    }
}

