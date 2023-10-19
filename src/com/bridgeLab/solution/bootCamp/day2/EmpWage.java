package com.bridgeLab.solution.bootCamp.day2;

public class EmpWage {

	public static final int IS_FULL_TIME =1;
	public static final int IS_PART_TIME =2;
	public static final int EMP_RATE_PER_HOUR =125;
	public static final int TOTAL_WORKING_DAYS=26;


	public static void main(String[] args) {
		
		int empHrs=0, empWage=0,totalWage=0;
//		double empCheck = Math.floor(Math.random()*10)%3;
//		System.out.println(empCheck);
//		
//		switch((int)empCheck) {
//			case IS_FULL_TIME:
//				System.out.println("Employee is present");
//				empHrs = 8;
//				break;
//			case IS_PART_TIME:
//				System.out.println("Employee is present");
//				empHrs =4;
//				break;
//			default:
//				System.out.println("Employee is not present");
//		}
//			empWage = empHrs*EMP_RATE_PER_HOUR;
//			System.out.println("the employee wage is "+empWage);
//			
//				}
//		}
//		
		for(int day = 1;day <= TOTAL_WORKING_DAYS;day++) {
			double empCheck = Math.floor(Math.random()*10)%3;
			System.out.println("Day "+day+" :"+empCheck);
			
			if(empCheck == IS_FULL_TIME) {
				System.out.println("Employee is full time present");
				empHrs =8;
			}
			else if(empCheck == IS_PART_TIME) {
				System.out.println("Employee is part time present");
				empHrs = 4;
			}
			else {
				System.out.println("Employee is not present");
				empHrs=0;
			}
			
			empWage = empHrs * EMP_RATE_PER_HOUR;
			
			totalWage = totalWage + empWage;
			System.out.println("total wage till day "+day+" :"+totalWage);
			System.out.println("---------------------------------------------");
		}
		
		/*
		 * 
		 *UC6: Calculate Wages till a condition of total working hours or
		  num of days is reached for a month 
          Assume 200 hours and 26 days
         */
	}
}
