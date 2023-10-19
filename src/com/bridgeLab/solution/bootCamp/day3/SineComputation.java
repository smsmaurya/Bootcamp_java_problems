package com.bridgeLab.solution.bootCamp.day3;

import java.util.Scanner;

public class SineComputation {

	public static void main(String[] args) {
		Scanner Sc =  new Scanner(System.in);
		System.out.println("Enter the degree : ");
		int num = Sc.nextInt();
		System.out.println("factorial of "+num +" is :"+factorial(num));
		
		   
	}
	public static int factorial(int num) {
		int facto =1;
		while(num>0) {
		facto *= num;
		num--;
		}
		return facto;
	}
	
	public static double radian(int degree) {
		double radian=0;
		double pi = 3.142;
		radian = degree*pi/180;
		return radian;
	}
	
	public static void sineSeries(int x) {
		
	}
	
	public static void computePower() {
		
	}
}

