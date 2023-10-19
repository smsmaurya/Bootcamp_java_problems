package com.bridgeLab.solution.bootCamp.day2;

import java.util.Scanner;

public class GradingSystem {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the socre between 1 to 100 : ");
		int score = scan.nextInt();
		
		if(score>=90 && score<=100) {
			System.out.println("Grade : 'A'");
		}
		else if(score>=80 && score<=89) {
			System.out.println("Grade : 'B'");
		}
		else if(score>=70 && score<=79) {
			System.out.println("Grade : 'C'");
		}
		else if(score>=60 && score<=69) {
			System.out.println("Grade : 'D'");
		}
		else if(score>=0 && score<=59) {
			System.out.println("Grade : 'F'");
		}
		else {
			System.out.println("Enter the valid score.");
		}
	}

}
