/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm2;

/**
 *
 * @author trung
 */
public class MeasuringAlgorithmEfficiency {
    
    public int getFirstElement(int[] arr) {
        return arr[0];  // Accessing the first element
    }

    public int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];  // Summing each element
        }
        return sum;
    }

    //Logarithmic Time Complexity (O(log N))
    public boolean binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
    
    
    public void printPairs(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println("(" + arr[i] + ", " + arr[j] + ")");
            }
        }
    }


    //2.	Space Complexity
    
    public int findMax(int[] arr) {
        int max = arr[0];  // Single variable to store the maximum value
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    
    
    public int[] copyArray(int[] arr) {
        int[] newArray = new int[arr.length];  // New array of the same size
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        return newArray;
    }


    int linearSearch(int array[], int size, int target) {
        for (int i = 0; i < size; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1; // if not found
    }

    
    void bubbleSort(int array[], int size) {
    for (int i = 0; i < size - 1; i++) {
        for (int j = 0; j < size - i - 1; j++) {
            if (array[j] > array[j + 1]) {
                swap(array[j], array[j + 1]);
            }
        }
    }
}

}
