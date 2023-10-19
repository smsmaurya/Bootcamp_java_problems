package com.bridgeLab.solution.bootCamp.day4;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.print("Enter the size of array : ");
		int size = sc.nextInt();
		
		System.out.println("Enter the array elements : ");
		int[] arr = new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("\nArray elements are: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n\nSorted array elements :");
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		int secondLargestNum = arr[arr.length-2];
		System.out.println("\n\nSecond largest number is : "+ secondLargestNum);
		
	}
}
