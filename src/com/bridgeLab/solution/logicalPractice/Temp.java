package com.bridgeLab.solution.logicalPractice;

import java.util.Random;

public class Temp {
	public static void main(String[] args) {
		Random r = new Random();
		int arr[] = new int[10];
		for(int i=0;i<10;i++) {
			arr[i] = r.nextInt(75-65+1)+65;
			System.out.print(arr[i]+" ");
		}
		
	}

}
