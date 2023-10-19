package com.bridgeLab.solution.bootCamp.day5;

import java.util.Scanner;

public class CountDifferentChars {
	public static void main(String[] args) {
		System.out.println("Enter the sentence: ");
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		
		countDifferentChars(sentence);
	}

	public static void countDifferentChars(String sentence) {
		
		char ch[] = sentence.toCharArray();
		int alphabets =0, digits=0,specialChar=0;
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='A'&& ch[i]<='Z' || ch[i]>='a'&& ch[i]<='z')
				alphabets++;
			else if(ch[i]>='0' && ch[i]<='9')
				digits++;
			else
				specialChar++;
		}
		
		System.out.println("\n\nIn the sentence have "+alphabets+" alphabets, "+digits+" digits and "+specialChar+" special characters.");
	}

}
