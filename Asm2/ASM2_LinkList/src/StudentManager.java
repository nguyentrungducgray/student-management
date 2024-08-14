import java.util.Scanner;

public class StudentManager {
    private StudentLinkedList studentList;

    public StudentManager() {
        this.studentList = new StudentLinkedList();
    }

    // Add new student
    public void addStudent() {
        try {
            Student student = new Student();
            Scanner sc = new Scanner(System.in);
            System.out.println("Add new student");
            System.out.print("Enter student ID: ");
            int idS = sc.nextInt();
            if (idS <= 0) {
                throw new IllegalArgumentException("Student ID must be greater than 0.");
            }
            student.setId(String.valueOf(idS));
            sc.nextLine(); // Consume the newline character

            System.out.print("Enter student name: ");
            String nameS = sc.nextLine();
            student.setName(nameS);

            System.out.print("Enter student age: ");
            int ageS = sc.nextInt();
            if (ageS <= 18) {
                throw new IllegalArgumentException("Student age must be greater than 18.");
            }
            student.setAge(ageS);
            sc.nextLine(); // Consume the newline character

            System.out.print("Enter student GPA: ");
            float gpaS = sc.nextFloat();
            if (gpaS < 0.0 || gpaS > 10.0) {
                throw new IllegalArgumentException("Student GPA must be between 0.0 and 10.0.");
            }
            student.setGpa(gpaS);

            studentList.add(student);
            System.out.println("Student added successfully!");
        } catch (IllegalArgumentException e) {
            System.out.println("Validation error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred while adding the student: " + e.getMessage());
        }
    }

    // Edit student
    public void editStudent() {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the student ID to update: ");
            int idS = sc.nextInt();
            if (idS <= 0) {
                throw new IllegalArgumentException("Student ID must be greater than 0.");
            }
            sc.nextLine(); // Consume the newline character

            System.out.print("Enter student name: ");
            String nameS = sc.nextLine();

            System.out.print("Enter student age: ");
            int ageS = sc.nextInt();
            if (ageS <= 18) {
                throw new IllegalArgumentException("Student age must be greater than 18.");
            }
            sc.nextLine(); // Consume the newline character

            System.out.print("Enter student GPA: ");
            float gpaS = sc.nextFloat();
            if (gpaS < 0.0 || gpaS > 10.0) {
                throw new IllegalArgumentException("Student GPA must be between 0.0 and 10.0.");
            }
            sc.nextLine(); // Consume the newline character

            Student newData = new Student(String.valueOf(idS), nameS, ageS, gpaS);
            if (studentList.update(String.valueOf(idS), newData)) {
                System.out.println("Student " + idS + " updated successfully!");
            } else {
                System.out.println("Student ID " + idS + " does not exist!");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Validation error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred while updating the student: " + e.getMessage());
        }
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
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the student ID to delete: ");
            String idS = sc.nextLine();
            if (Integer.parseInt(idS) <= 0) {
                throw new IllegalArgumentException("Student ID must be greater than 0.");
            }
            if (studentList.delete(idS)) {
                System.out.println("Student " + idS + " deleted successfully!");
            } else {
                System.out.println("Student ID " + idS + " does not exist!");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Validation error: " + e.getMessage());
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
            System.out.println("An error occurred while sorting the students: " + e.getMessage());
        }
    }

    
    // Search student by ID
    public void searchStudentById() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the student ID to search: ");
            String idS = sc.nextLine();
            if (Integer.parseInt(idS) <= 0) {
                throw new IllegalArgumentException("Student ID must be greater than 0.");
            }
            Student foundStudent = studentList.searchById(idS);
            if (foundStudent != null) {
                System.out.println("Student found: " + foundStudent.toString());
            } else {
                System.out.println("Student ID " + idS + " does not exist!");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Validation error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred while searching for the student: " + e.getMessage());
        }
    }
}
