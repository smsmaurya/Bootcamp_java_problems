package com.bridgeLab.solution.bootCamp.day1;

import java.util.Scanner;
import java.math.*;

public class Quadratic {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the value of a :");
		int a = scan.nextInt();
		System.out.print("Enter the value of b :");
		int b = scan.nextInt();
		System.out.print("Enter the value of c :");
		int c = scan.nextInt();
		
		int delta;
		
		delta = b*b -4*a*c;
		
		// Root 1 of x = (-b + sqrt(delta))/(2*a)
		// Root 2 of x = (-b - sqrt(delta))/(2*a)
		
		double x1 = (-b + Math.sqrt(delta))/(2*a);
		double x2 = (-b - Math.sqrt(delta))/(2*a);
		
		System.out.println("Root1 of x = "+x1);
		System.out.println("Root2 of x = "+x2);
		
	}

}
