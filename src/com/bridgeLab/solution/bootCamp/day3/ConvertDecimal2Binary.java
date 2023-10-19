package com.bridgeLab.solution.bootCamp.day3;

import java.util.Scanner;

public class ConvertDecimal2Binary {

	public static void main(String[] args) {
		System.out.println("Enter the decimal number : ");
		Scanner sc =new Scanner(System.in);
		int decNum = sc.nextInt();
		
		System.out.println("\nthe binary number is : \n"+cnvrtDec2Bin(decNum));
		
	}
	
	public static int cnvrtDec2Bin(int decNum) {
		
		String bin ="";
		int n = decNum;
		while(n>0) {
			int b = n%2;
			n=n/2;
			bin =b+bin;
		}
		return Integer.parseInt(bin);
		
	}
}
