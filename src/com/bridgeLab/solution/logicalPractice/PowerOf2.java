package com.bridgeLab.solution.logicalPractice;

public class PowerOf2 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java PowerOf2 <n>"); // command line argument means run program on cmd prompt and run= 'java PowerOf2 5'
            return;
        }

        try {
            int n = Integer.parseInt(args[0]);

            if (n < 0) {
                System.out.println("Please enter a non-negative integer.");
                return;
            }

            System.out.println("Powers of 2 less than or equal to 2^" + n + ":");

            for (int i = 0; i <= n; i++) {
                long powerOf2 = 1L << i; // Using bit shifting to calculate 2^i
                System.out.println("2^" + i + " = " + powerOf2);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}

