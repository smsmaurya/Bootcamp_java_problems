package com.bridgeLab.solution.bootCamp.day3;

public class FunctionPrograms {

	public static void main(String[] args) {
		addition(10,20);
		substraction();
	}

	private static void substraction() {
		int a=10, b=20,c;
		c=a-b;
		System.out.println("Substraction is : "+c);
		
	}

	private static void addition(int i, int j) {
		int c;
		c= i+j;
		System.out.println("Addtion is: "+c);
		
	}
}
