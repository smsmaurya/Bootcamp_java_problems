package com.bridgeLab.solution.bootCamp.day4;

import java.util.Scanner;

public class ReverseOrder {
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
		System.out.println("\nArray Elements are :");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\n\nThe array elements atfter reverse order :");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}

}
