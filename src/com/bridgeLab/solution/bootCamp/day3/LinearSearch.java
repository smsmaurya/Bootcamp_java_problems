package com.bridgeLab.solution.bootCamp.day3;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		int[] arr = new int[5];
		int key;
		//int count=0;
		boolean flag =false;;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements : ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("enter the key");
		key = sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			if(key==arr[i]) {
				//System.out.println("key found");
				flag = true;
				break;
			}
			else {
				//System.out.println("key not found");
				flag = false;
			}
		}
		if(flag) {
			System.out.println("key found");
		}
		else {
			System.out.println("key not found");
		}
	}
	
	

}
