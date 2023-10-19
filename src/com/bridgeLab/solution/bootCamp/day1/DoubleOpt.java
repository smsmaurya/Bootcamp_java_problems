package com.bridgeLab.solution.bootCamp.day1;

import java.util.Scanner;

public class DoubleOpt {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the three input values of a,b and c :-");
		
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		
		System.out.println();
		System.out.println("The Arithemetic operations");
		System.out.println("-----------------------------------");
		
		System.out.println("a+b*c : "+(a+b*c));
		System.out.println("a*b+c : "+(a*b+c));
		System.out.println("c+a/b : "+(c+a/b));
		System.out.println("a%b+c : "+(a%b+c));
	}

}
