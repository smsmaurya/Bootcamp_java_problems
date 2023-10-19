package com.bridgeLab.solution.bootCamp.day2;

import java.util.Random;
import java.util.Scanner;

public class RandomArrayGeneration {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array from 1 to 10 :");
		//int s = scan.nextInt();
		int s=0, attempts =3;
		for(int i=1;i<=attempts;i++) {
			s =scan.nextInt();
			if(s>=1 && s<=10) {
				break;
			}
			else if(i<3) {
				System.out.println("again, enter the array size between 1 to 10 : ");
			}
			else {
				System.out.println("Array size entered is not correct");
				System.exit(0);
			}
		}
		double[] rndmArray = new double[s];
		for(int i=0;i<rndmArray.length;i++) {
			rndmArray[i] = (Math.floor(Math.random()*1000))%500;
		}
		System.out.println("Random generated array elements are:");
		for(int i=0;i<rndmArray.length;i++) {
			System.out.println(rndmArray[i]);
		}
		
	}

}
