package com.bridgeLab.solution.bootCamp.day1;

import java.util.Scanner;

public class TimeConversion {
	public static void main(String[] args) {
		Scanner scan  =  new Scanner(System.in);
		 System.out.print("Enter the time in seconds for converting :");
		 int timeInSecond = scan.nextInt();
		 int second = timeInSecond;
		 int hrs,min,sec;
		 
//		 if(second<60) {
//			 if(second<3600) {
//				 if(second>=3600) {
//					 hrs = second/3600;
//					 second = second%3600;
//				 }
//				 min = second/60;
//				 second = second%60;
//			 }
//			 sec = second;
//			 System.out.println(second+" seconds = "+hrs+" hours,"+min+" minutes and "+sec+" seconds");
//
//		 }
		 
		 hrs = second/3600;
		 second = second%3600;
		 min = second/60;
		 second = second%60;
		 sec = second;
		 System.out.println();
		 System.out.println(timeInSecond+" seconds = "+hrs+" hours,"+min+" minutes and "+sec+" seconds");
	}

}
