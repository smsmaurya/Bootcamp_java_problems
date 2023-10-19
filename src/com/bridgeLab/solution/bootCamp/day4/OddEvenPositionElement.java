package com.bridgeLab.solution.bootCamp.day4;

import java.util.Scanner;

public class OddEvenPositionElement {
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
		System.out.println("====================================");
		System.out.println("the element on even position are");
		evenPosition(arr);
		System.out.println("-------------------------------------");
		System.out.println("the element on odd position are");
		oddPosition(arr);
	}
	
	public static void evenPosition(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				System.out.println(i+"th position is : "+arr[i]);
			}
		}
	}
	
	public static void oddPosition(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(i%2!=0) {
				System.out.println(i+"th position is : "+arr[i]);
			}
		}
	}

}
