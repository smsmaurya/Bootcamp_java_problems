package com.bridgeLab.solution.bootCamp.day2;

public class CalculateSunNAvg {
	public static void main(String[] args) {
		
		int arraySize = 75;
		int intNum[] = new int[arraySize];
		int totalSum=0;
		int average=0;
		
		for(int i=0;i<arraySize;i++) {
			
			intNum[i] = (int) (Math.floor(Math.random()*100));
		}
		
		for(int num:intNum) {
			System.out.print(num+" ");
		}
		System.out.println();
		
		for(int num:intNum) {
			totalSum += num;
		}
		System.out.println("The sum of the all elements : "+totalSum);
		
		average = totalSum/75;
		
		System.out.println("Average is : "+average);
		
		// int randNum = (int) (Math.floor(Math.random()*100));
		// System.out.println(randNum);
	}

}
