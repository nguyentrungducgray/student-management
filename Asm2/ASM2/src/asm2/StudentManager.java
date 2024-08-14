package asm2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentManager {

    private StudentArrayList studentList;

    public StudentManager() {
        this.studentList = new StudentArrayList();
    }

    // Add new student
    public void addStudent() {
        Student student = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("Add new student");
        
        String idS;
        while (true) {
            try {
                System.out.print("Enter student ID: ");
                idS = sc.nextLine();
                if (idS.matches("\\d+") && Integer.parseInt(idS) >= 0) {
                    break;
                } else {
                    System.out.println("Invalid ID. ID must be a non-negative number.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid ID.");
            }
        }
        student.setId(idS);

        System.out.print("Enter student name: ");
        String nameS = sc.nextLine();
        student.setName(nameS);
        
        int ageS;
        while (true) {
            try {
                System.out.print("Enter student age: ");
                ageS = sc.nextInt();
                if (ageS > 0) {
                    break;
                } else {
                    System.out.println("Invalid age. Age must be a positive number.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid age.");
                sc.next(); // clear the invalid input
            }
        }
        sc.nextLine();
        student.setAge(ageS);
        
        float gpaS;
        while (true) {
            try {
                System.out.print("Enter student GPA: ");
                gpaS = sc.nextFloat();
                if (gpaS >= 0.0 && gpaS <= 10.0) {
                    break;
                } else {
                    System.out.println("Invalid GPA. GPA must be between 0.0 and 10.0.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid GPA.");
                sc.next(); // clear the invalid input
            }
        }
        sc.nextLine();
        student.setGpa(gpaS);
        
        studentList.add(student);
        System.out.println("Student added successfully!");
    }

    // Edit student
    public void editStudent() {
        Scanner sc = new Scanner(System.in);
        String idS;
        while (true) {
            try {
                System.out.print("Enter the student ID to update: ");
                idS = sc.nextLine();
                if (idS.matches("\\d+") && Integer.parseInt(idS) >= 0) {
                    break;
                } else {
                    System.out.println("Invalid ID. ID must be a non-negative number.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid ID.");
            }
        }
        
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId().equals(idS)) {
                String nameS = null;
                int ageS = -1;
                float gpaS = -1;              
                try {
                    System.out.print("Enter student name: ");
                    nameS = sc.nextLine();                  
                    while (true) {
                        System.out.print("Enter student age: ");
                        ageS = sc.nextInt();
                        if (ageS > 0) {
                            break;
                        } else {
                            System.out.println("Invalid age. Age must be a positive number.");
                        }
                    }
                    sc.nextLine();
                    while (true) {
                        System.out.print("Enter student GPA: ");
                        gpaS = sc.nextFloat();
                        if (gpaS >= 0.0 && gpaS <= 10.0) {
                            break;
                        } else {
                            System.out.println("Invalid GPA. GPA must be between 0.0 and 10.0.");
                        }
                    }
                    sc.nextLine();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter valid values for age and GPA.");
                    sc.next(); // clear the invalid input
                }
                Student newData = new Student(idS, nameS, ageS, gpaS);
                studentList.set(i, newData);
                System.out.println("Student " + idS + " updated successfully!");
                return;
            }
        }
        System.out.println("Student ID " + idS + " does not exist!");
    }

    // Display student list
    public void printStudentList() {
        try {
            studentList.printList();
        } catch (Exception e) {
            System.out.println("An error occurred while printing the student list: " + e.getMessage());
        }
    }

    // Delete student
    public void deleteStudent() {
        Scanner sc = new Scanner(System.in);
        String idS;
        try {
            System.out.print("Enter the student ID to delete: ");
            idS = sc.nextLine();
            if (studentList.removeById(idS)) {
                System.out.println("Student " + idS + " deleted successfully!");
            } else {
                System.out.println("Student ID " + idS + " does not exist!");
            }
        } catch (Exception e) {
            System.out.println("An error occurred while deleting the student: " + e.getMessage());
        }
    }
    
    // Sort students by GPA
    public void sortStudentsByGPA() {
        try {
            studentList.sortByGPA();
            studentList.printList();
        } catch (Exception e) {
            System.out.println("An error occurred while sorting the students by GPA: " + e.getMessage());
        }
    }
    
    // Sort students by GPA using Quick Sort
    public void sortStudentsByGPA1() {
        try {
            studentList.sortByGPA1();
            studentList.printList();
        } catch (Exception e) {
            System.out.println("An error occurred while sorting the students using Quick Sort: " + e.getMessage());
        }
    }
    
    // Search student by ID
    public void searchStudentById() {
        Scanner sc = new Scanner(System.in);
        String idS;
        try {
            System.out.print("Enter the student ID to search: ");
            idS = sc.nextLine();
            Student student = studentList.searchById(idS);
            if (student != null) {
                System.out.println("Student found: " + student.toString());
            } else {
                System.out.println("Student ID " + idS + " does not exist!");
            }
        } catch (Exception e) {
            System.out.println("An error occurred while searching for the student: " + e.getMessage());
        }
    }
    
    // Search student by ID
    public void searchStudentById1() {
        Scanner sc = new Scanner(System.in);
        String idS;
        try {
            System.out.print("Enter the student ID to search: ");
            idS = sc.nextLine();
            Student student = studentList.binarySearchById(idS);
            if (student != null) {
                System.out.println("Student found: " + student.toString());
            } else {
                System.out.println("Student ID " + idS + " does not exist!");
            }
        } catch (Exception e) {
            System.out.println("An error occurred while searching for the student: " + e.getMessage());
        }
    }
}
