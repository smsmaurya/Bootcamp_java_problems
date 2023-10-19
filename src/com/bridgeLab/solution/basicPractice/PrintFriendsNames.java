package com.bridgeLab.solution.basicPractice;

public class PrintFriendsNames {
	
	public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Please provide exactly 3 friend names as input arguments.");
            return;
        }

        String friend1 = args[2]; // Reverse order
        String friend2 = args[1];
        String friend3 = args[0]; // Add "and" before this name

        String greeting = "Hi " + friend1 + ", " + friend2 + " and " + friend3;
        System.out.println(greeting);
    }

}
