package com.bridgeLab.solution.bootCamp.day2;

import java.util.Scanner;

public class DayOfTheWeek {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Select the day number from 1 to 7 : ");
		int dayNumber = scan.nextInt();
		
		switch(dayNumber) {
			case 1:
				System.out.println("1 - Sunday");
				break;
			case 2:
				System.out.println("2 - Monday");
				break;
			case 3:
				System.out.println("3 - Tueday");
				break;
			case 4:
				System.out.println("4 - Wednesday");
				break;
			case 5:
				System.out.println("5 - Thursday");
				break;
			case 6:
				System.out.println("6 - Friday");
				break;
			case 7:
				System.out.println("7 - Saturday");
				break;
			default :
				System.out.println("Invalid day number");
		}
	}

}
