package com.bridgeLab.solution.basicPractice;
import java.util.Scanner;

public class StringToASCII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Create an array to store ASCII values
        int[] asciiArray = new int[input.length()];

        // Convert each character to ASCII and store in the array
        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            int asciiValue = (int) character;
            asciiArray[i] = asciiValue;
        }

        // Print the array
        System.out.print("ASCII values: ");
        for (int value : asciiArray) {
            System.out.print(value + " ");
        }

        scanner.close();
    }
}

