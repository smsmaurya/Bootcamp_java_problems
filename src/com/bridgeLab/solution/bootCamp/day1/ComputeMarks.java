package com.bridgeLab.solution.bootCamp.day1;

import java.util.Scanner;

public class ComputeMarks {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the student name : ");
		String studentName = scan.next();
		
	
		System.out.println("Enter physics marks : ");
		double physicsMarks = scan.nextInt();
		if(physicsMarks <0 && physicsMarks >100) {
			System.out.println("Enter marks between 0 to 100 out of 100");
		}
		
		System.out.println("Enter chemistry marks : ");
		double chemistryMarks = scan.nextInt();
		if(chemistryMarks <0 && chemistryMarks >100) {
			System.out.println("Enter marks between 0 to 100 out of 100");
		}
		
		System.out.println("Enter mathematics marks : ");
		double mathematicsMarks = scan.nextInt();
		if(mathematicsMarks <0 && mathematicsMarks >100) {
			System.out.println("Enter marks between 0 to 100 out of 100");
		}
		
		double totalMarks = physicsMarks+chemistryMarks+mathematicsMarks;
		
		double physicsPercent = (physicsMarks/100)*100;
		double chemistryPercent = (chemistryMarks/100)*100;
		double mathematicsPercent = (mathematicsMarks/100)*100;
		double totalPercent = (totalMarks/300)*100;
		
		System.out.println("--------------------------------------------------------------------");
		System.out.println();
		System.out.println(studentName+" obtained following % of marks in PCM:\r\n"
				+ "Physics: "+physicsPercent+", Chemistry : "+chemistryPercent+", Maths : "+mathematicsPercent+"\r\n"
				+ "Total : "+totalPercent);
		
	}

}
