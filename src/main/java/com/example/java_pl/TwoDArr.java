package com.example.java_pl;

import java.util.Scanner;

public class TwoDArr {

    // Method to handle 2D array operations
    static void func2D(int[][] arr, int size, Scanner scan) {
        // Populate the array with user input
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println("Enter the value of the element at [" + i + "][" + j + "]: ");
                arr[i][j] = scan.nextInt();
            }
        }

        // Print the array
        System.out.println("The 2D array elements are:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Calculate and print the sum of all elements
        int sumArr = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sumArr += arr[i][j];
            }
        }
        System.out.println("Sum of all elements: " + sumArr);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.println("Enter the size of the 2D array:");
        int size = scan.nextInt();

        // Initialize the 2D array
        int[][] arr = new int[size][size];

        // Perform 2D array operations
        func2D(arr, size, scan);

        scan.close();
    }
}
