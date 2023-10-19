package com.bridgeLab.solution.bootCamp.day1;

import java.util.Scanner;

public class WeightConversion {
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		
		System.out.print("Enter the grocery's total weight in pounds :");
		double weigthPounds = scan.nextDouble();
		
		// convert pounds in kg
		// 1 Pounds = 453.592gm
		
		double weightInKG = (weigthPounds*453.592)/1000;
		
		System.out.println();
		System.out.println(" After converting pounds weigth in Kg : "+ weightInKG+"kg");
		
	}

}
