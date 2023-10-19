package com.bridgeLab.solution.bootCamp.day5;

import java.util.Scanner;

public class ReverseWords {
	public static void main(String[] args) {
		System.out.println("Enter the sentence : ");
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		
		System.out.println(reverseWords(line));
//		System.out.println(revWords(line));
	}
	
	public static String revWords(String sentence) {
		char[] ch = sentence.toCharArray();
		String revString ="";
		for(int i=0;i<ch.length;i++) {
			int k=i;
			while(i>=0 && ch[i]!=' ') {
				i++;
			}
			int j =i-1;
			while(j<=k) {
				revString +=ch[j];
				j--;
			}
			if(i>=0) {
				revString = revString+ch[i];
			}
		}
		return revString;	
	}
	
	
	public static String reverseWords(String line) {
		String words[] = line.split(" ");
		
		StringBuilder revLine = new StringBuilder();
		
		for(String word : words) {
			StringBuilder revWord = new StringBuilder(word);
			revWord.reverse();
			revLine.append(revWord).append(' ');
		}
		
		return revLine.toString();
		
	}

}
