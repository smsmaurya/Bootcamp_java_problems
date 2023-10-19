package com.bridgeLab.solution.bootCamp.day5;

import java.util.Scanner;

public class ReverseCase {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the sentence: ");
		Scanner scan = new Scanner(System.in);
		String str =  scan.nextLine();
		
		String reverseCase = reverseCase(str);
		System.out.println(reverseCase);
	}

	public static String reverseCase(String str) {
		String reverseCase = "";
		for(int i=0;i<str.length();i++) {
		 char ch = str.charAt(i);
		 if(ch>='A' && ch<='Z') {
			 ch = (char) (ch+32);
			 reverseCase += ch;
		 }
		 else if(ch>='a' && ch<='z') {
			 ch = (char)(ch-32);
			 reverseCase += ch;
		}
		 else {
			 reverseCase += ch;
		 }
		}
		
		
		return reverseCase;
	}

}
