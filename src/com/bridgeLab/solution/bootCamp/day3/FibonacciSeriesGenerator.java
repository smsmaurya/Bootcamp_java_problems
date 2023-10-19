package com.bridgeLab.solution.bootCamp.day3;

import java.util.Scanner;

public class FibonacciSeriesGenerator {
	
	public static int[] fibonacciLogic(int n) {
		int fibonacciSeries[] = new int[n];
		fibonacciSeries[0] = 0;
		fibonacciSeries[1] = 1;
		
		for(int i = 2; i < n; i++) {
			fibonacciSeries[i] = fibonacciSeries[i-1] + fibonacciSeries[i-2];
		}
		return fibonacciSeries;
	}
	
		
	public static void fibonacciSeperator(int num) {
		int arr[] = fibonacciLogic(num);
		for(int i=0;i<arr.length-1;i++) {
			System.out.print(arr[i]);
			if((i+1)%5!=0)
				System.out.print(",");
			else
				System.out.println();
		}
	}
		
	public static void main(String[] args) {
		  
		  Scanner scan = new Scanner(System.in); 
		  System.out.print("Enter size for fibonacci series(n) : ");
		  int n = scan.nextInt();
		  //fibonacciLogic(n);
		  fibonacciSeperator(n);  
	 }

}
