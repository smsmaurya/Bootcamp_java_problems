package com.bridgeLab.solution.bootCamp.day2;

import java.util.Scanner;

public class NumberTable {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number for table : ");
		int num =  scan.nextInt();
		
		for(int i = 1;i<=10;i++) {
			System.out.println(num+" * "+i+" = "+num*i);
		}
	}

}
