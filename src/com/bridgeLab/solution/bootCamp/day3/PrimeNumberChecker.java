package com.bridgeLab.solution.bootCamp.day3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PrimeNumberChecker {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array (n): ");
        int n = scanner.nextInt();
        System.out.print("Enter lower limit: ");
        int lowerLimit = scanner.nextInt();
        System.out.print("Enter upper limit: ");
        int upperLimit = scanner.nextInt();

        System.out.println("--------------------------------------------------------------");
        int[] randomArray = randomArrayGenerator(n, lowerLimit, upperLimit);

        int[] nonPrimeNumberArray = filterNonPrimeNumber(randomArray);

        int countPrimeNumber = n - nonPrimeNumberArray.length;
        System.out.println("Number of prime numbers: " + countPrimeNumber);

        System.out.println("New non-prime array:");
        for (int num : nonPrimeNumberArray) {
            System.out.print(num + " ");
        }
    }
	
	public static boolean isPrime(int number) {
		int j=2;
		while(j<=number/2) {
			if(number%j==0)
				return false;
			j++;
		}
		return true;
	}	
	
	public static int[] randomArrayGenerator(int n, int lowerLimit, int upperLimit) {
		
		Random random = new Random();
        int[] randomArray = new int[n];
        for (int i = 0; i < n; i++) {
            randomArray[i] = random.nextInt(upperLimit - lowerLimit) + lowerLimit;
            //randomArray[i] = ((int)(Math.floor(Math.random(upperLimit-lowerLimit))+lowerLimit));  
        }
        return randomArray;
	}
	
	public static int[] filterNonPrimeNumber(int[] randomArray) {
		
		int[] nonPrimeNumberArray = new int[randomArray.length];
        int countNonPrimeNumber = 0;
        for (int num : randomArray) {
            if (!isPrime(num)) {
                nonPrimeNumberArray[countNonPrimeNumber] = num;
                countNonPrimeNumber++;
            }
        }
        return Arrays.copyOf(nonPrimeNumberArray, countNonPrimeNumber);
		//return array and size of array;
		
	}

}
