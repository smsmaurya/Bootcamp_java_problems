package com.bridgeLab.solution.bootCamp.day2;

import java.util.Scanner;

public class RandomArraySumNAvg {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double[] rndmArray = new double[75];
		for(int i=0;i<rndmArray.length;i++) {
			rndmArray[i] = Math.floor(Math.random()*1000);
		}
		
		double avgOfElements =0,sumOfArrayElements=0;
		
		for(int i=0;i<rndmArray.length;i++) {
			sumOfArrayElements += rndmArray[i];
		}
		avgOfElements = sumOfArrayElements/rndmArray.length;
		
		System.out.println("The sum of random array elements is : "+sumOfArrayElements);
		System.out.println("\nThe average of random of array elements is : "+avgOfElements);
	}

}
