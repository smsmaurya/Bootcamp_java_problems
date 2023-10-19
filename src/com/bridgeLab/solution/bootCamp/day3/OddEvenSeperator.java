package com.bridgeLab.solution.bootCamp.day3;

import java.util.Arrays;
import java.util.Scanner;

public class OddEvenSeperator {
	
	public static int[] fibonacciLogic(int n) {
		int fibonacciSeries[] = new int[n];
		fibonacciSeries[0] = 0;
		fibonacciSeries[1] = 1;
		
		for(int i = 2; i < n; i++) {
			fibonacciSeries[i] = fibonacciSeries[i-1] + fibonacciSeries[i-2];
		}
		//return fibonacciSeries;
		return Arrays.copyOf(fibonacciSeries, n);
	}
	
	public static boolean isEven(int num) {
		return num%2==0;
	}
	
	public static boolean isOdd(int num) {
		return num%2!=0;
	}
	
	
	public static int[] oddSeperator(int[] fibonacciSeries ) {
		int[] oddArray = new int[fibonacciSeries.length];
        int index = 0;
        for (int num : fibonacciSeries) {
            if (isOdd(num)) {
                oddArray[index] = num;
                index++;
            }
        }
        return Arrays.copyOf(oddArray, index);	
	}
	
	public static int[] evenSeperator(int[] fibonacciSeries ) {
		int[] evenArray = new int[fibonacciSeries.length];
        int index = 0;
        for (int num : fibonacciSeries) {
            if (isEven(num)) {
                evenArray[index] = num;
                index++;
            }
        }
        return Arrays.copyOf(evenArray, index);	
	}
	
	public static void main(String[] args) {
		  
		  Scanner scan = new Scanner(System.in); 
		  System.out.print("Enter size for fibonacci series(n) : ");
		  int n = scan.nextInt();
		  
		  int[] fibonacciSeries = fibonacciLogic(n);
		  System.out.print("Fibbonacci series are :=> ");
		  for(int num : fibonacciSeries) {
			  System.out.print(num+" ");
		  }
		  System.out.println();
		  
		  int[] oddArray = oddSeperator(fibonacciSeries);
		  System.out.print("Odd numbers are :=> ");
		  for(int num : oddArray) {
			  System.out.print(num+" ");
		  }
		  System.out.println();
		  
		  int[] evenArray = evenSeperator(fibonacciSeries);
		  System.out.print("Even numbers are :=> ");
		  for(int num : evenArray) {
			  System.out.print(num+" ");
		  }
		  System.out.println();
		  
		  if (oddArray.length > evenArray.length) {
	            System.out.println("Odd numbers are more.");
	        } else if (oddArray.length < evenArray.length) {
	            System.out.println("Even numbers are more.");
	        } else {
	            System.out.println("Odd and even numbers are equal.");
	        }
		    
	 }


}
