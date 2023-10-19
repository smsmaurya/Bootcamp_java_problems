package com.bridgeLab.solution.bootCamp.day2;

public class EmployeeWage {
	public static void main(String[] args) {
		int is_FULL_TIME =1;
		int is_PART_TIME =2;
		int Emp_RATE_PER_HOUR =125;
		int empHrs=0, empWage=0;
		double empCheck = Math.floor(Math.random()*10)%3;
		System.out.println(empCheck);
		
		System.out.println("--------------------------");
		
		if(empCheck == is_FULL_TIME) {
			
			System.out.println("Employee is full time present");
			empHrs =8;
		}
		else if(empCheck==is_PART_TIME) {
			System.out.println("Employee is part time present");
			empHrs = 4;
		}
		else {
			System.out.println("Employee is not present");
			empHrs=0;
		}
		empWage = empHrs*Emp_RATE_PER_HOUR;
		System.out.println("Employee wage is "+ empWage+"Rs");
	}

}
