package com.bridgeLab.solution.bootCamp.day2;

import java.util.Scanner;

public class ArrayOfSquare {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int arrOfSquare[] = new int[10];
		for(int i = 1; i <= 10; i++) {
			arrOfSquare[i-1] = i*i;
		}
		
		//System.out.println(arrOfSquare);
		for(int generateSquare : arrOfSquare) {
			System.out.print(generateSquare+" ");
		}
	}

}
