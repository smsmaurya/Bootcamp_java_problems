package com.bridgeLab.solution.bootCamp.day3;

import java.util.Scanner;

public class ArrayTest3 {
	
	public static void main(String[] args) {
		
	int[] arr =	inputArray();
		displayArray(arr);
	}
	
	public static void displayArray(int[] arr) {
		System.out.println("array elements are:");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static int[] inputArray() {
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array element : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	}

}
