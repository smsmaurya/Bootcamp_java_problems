package com.bridgeLab.solution.bootCamp.day2;

import java.util.Scanner;

public class ReverseString {
	
	public String revString(String string) {
		
		char ch[] = string.toCharArray();
		String newString = "";
		//string.charAt(0);

		for(int i = ch.length-1;i>=0;i--) {
			newString += ch[i];
		}
		return newString;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String string = sc.nextLine();
		
		ReverseString reverseString = new ReverseString();
		System.out.println(reverseString.revString(string));
		
	}

}
