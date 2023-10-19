package com.bridgeLab.solution.bootCamp.day4;

import java.util.Scanner;

public class DuplicateElement {
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
		duplicateElements(arr);
	}
	
	public static void duplicateElements(int[] arr) {
		int bigNum = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(bigNum<arr[i]) {
				bigNum = arr[i];
			}
		}
		int count[] = new int[bigNum+1];
		for(int i=0;i<arr.length;i++) {
			count[arr[i]]++;
		}
		System.out.println("\n\nDuplicate elements are: ");
		for(int i=0;i<count.length;i++) {
			if(count[i]>1) {
				System.out.print(i+" ");
			}
		}
	}

}
