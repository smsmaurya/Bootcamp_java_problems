package com.bridgeLab.solution.logicalPractice;

import java.util.Scanner;

public class PrimeNumberInRange {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the lower bound of the range: ");
	        int lowerBound = scanner.nextInt();

	        System.out.print("Enter the upper bound of the range: ");
	        int upperBound = scanner.nextInt();

	        System.out.println("Prime numbers in the range " + lowerBound + " to " + upperBound + ":");
	        
	        for (int num = lowerBound; num <= upperBound; num++) {
	            if (isPrime(num)) {
	                System.out.print(num + " ");
	            }
	        }
	        scanner.close();
	 }

	private static boolean isPrime(int num) {
		int i =2;
		while(i<=num/2) {
			if(num%i==0) {
				return false;
			}
			i++;
		}
		return true;
	}

}
