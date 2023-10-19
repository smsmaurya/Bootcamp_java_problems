package com.bridgeLab.solution.bootCamp.day4;

import java.util.Scanner;

public class LargestNSmallestElement {
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
		
		System.out.println("The largest element is : "+largestElement(arr));
		System.out.println("The smallest element is : "+smallestElement(arr));

	}
	
	public static int largestElement(int[] arr) {
		int largeNum = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(largeNum<arr[i]) {
				largeNum = arr[i];
			}
		}
		return largeNum;	
	}
	
	public static int smallestElement(int[] arr) {
		int smallNum = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(smallNum>arr[i]) {
				smallNum = arr[i];
			}
		}
		return smallNum;	
	}

}
