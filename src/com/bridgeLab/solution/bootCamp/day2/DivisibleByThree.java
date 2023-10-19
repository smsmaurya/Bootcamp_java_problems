package com.bridgeLab.solution.bootCamp.day2;

public class DivisibleByThree {
	
	//int strt = 1;
	//int end = 30;
	public static void main(String[] args) {
		int divisibleByThree[] = new int [10];
		int index = 0;
		for(int i=1;i<=30;i++) {
			if(i%3==0) {
				divisibleByThree[index] = i;
				index++;
			}
		}
		System.out.println("All numbers between 1 to 30 which are divisible by 3 :");
		for(int divBy3 : divisibleByThree) {
			System.out.print(divBy3+" ");
		}
	}

}
