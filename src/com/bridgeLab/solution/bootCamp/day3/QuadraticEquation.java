package com.bridgeLab.solution.bootCamp.day3;

import java.util.Scanner;

public class QuadraticEquation {
	
	public static int delta(int a, int b, int c) {
		
		return b*b-4*a*c;	
	}
	
	public static String rootOfX(int a, int b, int c) {
		
		int delta = delta(a,b,c);
		double x1 = Math.round((-b + Math.sqrt(delta))/(2*a));
		double x2 = Math.round((-b - Math.sqrt(delta))/(2*a));
		return "the root of x1 = "+x1+"\n the root of x2 = "+x2;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Quadratic equation : a*x*x + b*x + c" );
		System.out.println();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter value of 'a' : ");
		int a = scan.nextInt();
		System.out.print("Enter value of 'b' : ");
		int b = scan.nextInt();
		System.out.print("Enter value of 'c' : ");
		int c = scan.nextInt();
		System.out.println();
		
		System.out.println(" the roots of x are : ");
		System.out.println(delta(a,b,c));
		System.out.println(rootOfX(a, b, c));
		
	}

}
