package com.bridgeLab.solution.bootCamp.day1;

import java.util.Scanner;

public class SpeedConversion {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the speed in km/hrs ");
		int km = scan.nextInt();
		int hrs = scan.nextInt();
		
		System.out.println("Your entered speed in k/h "+km+"/"+hrs);
		
		int meter = km*1000;
		int second = hrs*3600;
		
		System.out.println("Aafter converting speed in m/s "+meter+"/"+second);
	}

}
