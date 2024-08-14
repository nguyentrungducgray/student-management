
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author trung
 */
public class Main {

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
                case 6 -> sm.searchStudentById();
                case 7 -> System.out.println("Goodbye!");
                default -> {
                    System.out.println("The function you chose does not exist!");
                    System.out.println("Please choose again!");
                }
            }
        } while (choose != 7);
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
        System.out.println("5. Sort students by GPA");
        System.out.println("6. Search student by ID");
        System.out.println("7. Exit program");
        System.out.print("Your choice?: ");
    }
}
