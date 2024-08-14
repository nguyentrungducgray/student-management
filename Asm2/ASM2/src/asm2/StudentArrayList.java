    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package asm2;

    /**
     *
     * @author trung
     */
    public class StudentArrayList {
        private Student[] array;
        private int size;
        private static final int INITIAL_CAPACITY = 10;

        public StudentArrayList() {
            array = new Student[INITIAL_CAPACITY];
            size = 0;
        }

        // Thêm một phần tử vào cuối danh sách
        public void add(Student student) {
            if (size == array.length) {
                resize();
            }
            array[size++] = student;
        }

        // Lấy phần tử tại vị trí chỉ định
        public Student get(int index) {
            if (index >= size || index < 0) {
                throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
            }
            return array[index];
        }
        // Cập nhật phần tử tại vị trí chỉ định
        public void set(int index, Student student) {
            if (index >= size || index < 0) {
                throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
            }
            array[index] = student;
        }
        // Xóa phần tử tại vị trí chỉ định
        public void remove(int index) {
            if (index >= size || index < 0) {
                throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
            }
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            array[--size] = null;
        }
        // Trả về số lượng phần tử trong danh sách
        public int size() {
            return size;
        }
        // In danh sách sinh viên
        public void printList() {
            System.out.println("Student list");
            System.out.printf("%-12s%-15s%-9s%-7s%-12s", "ID", "Name", "Age", "GPA", "Ranking");
            System.out.println("");
            for (int i = 0; i < size; i++) {
                System.out.println(array[i].toString());
            }
        }
        // Phương thức nội bộ để tăng kích thước mảng
        private void resize() {
            int newSize = array.length * 2;
            Student[] newArray = new Student[newSize];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        // Sắp xếp danh sách theo điểm
        public void sortByGPA() {
            for (int i = 0; i < size - 1; i++) {
                for (int j = i + 1; j < size; j++) {
                    if (array[i].getGpa() > array[j].getGpa()) {
                        Student temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }

        // Phương thức chính để sắp xếp danh sách theo GPA bằng Quick Sort
    public void sortByGPA1() {
            quickSort(0, size - 1);
        }

    // Phương thức phụ cho Quick Sort
        private void quickSort(int low, int high) {
            if (low < high) {
                int pi = partition(low, high);

                quickSort(low, pi - 1);  // Sắp xếp các phần tử trước phân vùng
                quickSort(pi + 1, high); // Sắp xếp các phần tử sau phân vùng
            }
        }

    // Phân vùng danh sách theo GPA
        private int partition(int low, int high) {
            double pivot = array[high].getGpa(); // Chọn phần tử cuối làm pivot
            int i = (low - 1); // Chỉ số của phần tử nhỏ hơn

            for (int j = low; j < high; j++) {
                if (array[j].getGpa() <= pivot) {
                    i++;
                    // Hoán đổi array[i] và array[j]
                    Student temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            // Hoán đổi array[i + 1] và array[high] (pivot)
            Student temp = array[i + 1];
            array[i + 1] = array[high];
            array[high] = temp;

            return i + 1;
        }

        
        // Sắp xếp danh sách theo ID
        public void sortById() {
                    for (int i = 0; i < size - 1; i++) {
                        int minIndex = i;
                        for (int j = i + 1; j < size; j++) {
                            if (array[j].getId().compareTo(array[minIndex].getId()) < 0) {
                                minIndex = j;
                            }
                        }
                        // Hoán đổi phần tử hiện tại với phần tử nhỏ nhất
                        if (minIndex != i) {
                            Student temp = array[i];
                            array[i] = array[minIndex];
                            array[minIndex] = temp;
                        }
                    }
                }

        
        // Binary search by ID
    public Student binarySearchById(String id) {
        // Ensure the list is sorted by ID before performing binary search
        sortById();

        int left = 0;
        int right = size - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            Student midStudent = array[mid];
            
            int comparison = midStudent.getId().compareTo(id);
            if (comparison == 0) {
                return midStudent; // Found the student
            } else if (comparison < 0) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return null; // Student not found
    }

        // Linear search by ID
    public Student searchById(String id) {
        for (int i = 0; i < size; i++) {
            if (array[i].getId().equals(id)) {
                return array[i]; // Found the student
            }
        }
        return null; // Student not found
    }
    
    // Remove student by ID
    public boolean removeById(String id) {
        for (int i = 0; i < size; i++) {
            if (array[i].getId().equals(id)) {
                remove(i);
                return true; // Student removed successfully
            }
        }
        return false; // Student not found
    }
    }

