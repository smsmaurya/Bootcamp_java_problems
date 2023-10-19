package com.bridgeLab.solution.bootCamp.day5;

import java.util.Scanner;

public class VowelCounting {
	public static void main(String[] args) {
		
		System.out.println("Enter the sentance : ");
		Scanner scan = new Scanner(System.in);
		String str= scan.nextLine();
		
		char[] vowels = {'a','e','i','o','u'};
		int[][] vowelCount =vowelCount(str,vowels);
		
		
		// print on the console
		for(int i=0;i<vowels.length;i++) {
			System.out.println(vowels[i]+" = "+vowelCount[0][i]+" times");
	//		System.out.println(vowels[i]+" = "+vowelCount[i][0]+" times");

		}
		
	}
	
	public static int [][] vowelCount(String str, char[] vowels){
		
		// 1 row and 5 column
		int[][] resultIn2DArray = new int[1][vowels.length];
		// 5 row and 1 column
	//	int[][] resultIn2DArray = new int[vowels.length][1];
		
		for (int i = 0; i < vowels.length; i++) {
			resultIn2DArray[0][i] = 0;         // initialize result
	//		resultIn2DArray[i][0] = 0;
        }
		
		str = str.toLowerCase();  
		
		for(int i=0;i<str.length();i++) {
			char strChar = str.charAt(i);
			for(int j=0;j<vowels.length;j++) {
				char vowel = vowels[j];
				if(strChar == vowel) {
					resultIn2DArray[0][j]++;
	//				resultIn2DArray[j][0]++;
				}
			}
		}
	
		return resultIn2DArray;
		
	}

}
