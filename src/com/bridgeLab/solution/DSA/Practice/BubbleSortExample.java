package com.bridgeLab.solution.DSA.Practice;

import java.util.Scanner;

public class BubbleSortExample {
    public static void main(String[] args) {
        int[] array = new int[10];

        // Take input and create the array
        takeInputAndCreateArray(array);

        // Sort the array using Bubble Sort
        bubbleSort(array);

        // Display the sorted array
        System.out.println("Sorted Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    // Method to take input and create an array
    public static void takeInputAndCreateArray(int[] arr) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 10 integer numbers:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        scanner.close();
    }

    // Method to perform Bubble Sort on the array
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped in the inner loop, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
}

