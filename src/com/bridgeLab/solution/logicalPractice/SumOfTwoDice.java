package com.bridgeLab.solution.logicalPractice;

import java.util.Random;

public class SumOfTwoDice {
    public static void main(String[] args) {
        Random rand = new Random();

        // Generate random numbers between 1 and 6 for two dice
        int die1 = rand.nextInt(6) + 1;
        int die2 = rand.nextInt(6) + 1;
        

        // Calculate the sum of the two dice
        int sum = die1 + die2;

        // Print the results
        System.out.println("Rolling two dice...");
        System.out.println("Die 1: " + die1);
        System.out.println("Die 2: " + die2);
        System.out.println("Sum of two dice: " + sum);
    }
}

