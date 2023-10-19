package com.bridgeLab.solution.bootCamp.day4;

import java.util.Scanner;

public class PrintArrayElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of array : ");
		int size = sc.nextInt();
		
		System.out.println("Enter the array elements : ");
		int[] arr = new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Array elements are : ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}

}
