package com.bridgeLab.solution.bootCamp.day1;

import java.util.Scanner;

//Write a IntOpt program by taking a, b and c as input values and 
//print the following integer operations a + b *c, a * b + c,
//c + a / b, and a % b + c. Please discuss the precedence of the operators.

/*
 * 
 * Similarly write the DoubleOpt program by taking double value
 *  and doing the same operations.
 *  
 * Write a TemperatureConversion program, given the temperature in Fahrenheit as input
 * outputs the temperature in Celsius or vice versa using the formula
 *  Celsius to Fahrenheit:   (°C × 9/5) + 32 = °F
 *  Fahrenheit to Celsius:   (°F − 32) x 5/9 = °C
 *  
*/
public class ArithemeticOperations {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the three input values of a,b and c :-");
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		System.out.println();
		System.out.println("The Arithemetic operations");
		System.out.println("-----------------------------------");
		
		System.out.println("a+b*c : "+(a+b*c));
		System.out.println("a*b+c : "+(a*b+c));
		System.out.println("c+a/b : "+(c+a/b));
		System.out.println("a%b+c : "+(a%b+c));
	}

}
