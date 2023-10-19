package com.bridgeLab.solution.bootCamp.day2;

import java.util.Scanner;

public class LeapYear {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a year : ");
		int year = scan.nextInt();
		if(year<1582) {
			System.out.println("Enter year from 1852.");
		}
		
		boolean isLeapYear = (year%4 == 0 && year%100 != 0 || year%400 == 0) ? true:false;
		
		if(isLeapYear==true) {
			System.out.println(year+" is a Leap Year");
		}
		else {
			System.out.println(year+" is not a Leap Year");
		}
		
	}

}
