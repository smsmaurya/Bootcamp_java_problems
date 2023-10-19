package com.bridgeLab.solution.bootCamp.day5;

import java.util.Scanner;

public class ExtractWords {
	public static void main(String[] args) {
		System.out.println("Enter the sentence : ");
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		
		//System.out.println(revWords(sentence));
		
		int totalWords = countWords(sentence);
		System.out.println(totalWords);
		
//		String[] wordsOfSentence =extractWords(sentence, totalWords);
//		for(String word : wordsOfSentence) {
//			System.out.println(word);
//		}
		
		String[] words = extractWordUseRdmdFunc(sentence);
		for(String word : words) {
			System.out.println(word);
		}
	}

	private static String[] extractWords(String sentence, int totalWords) {
		
		String[] words = new String[totalWords];
		
		char[] ch = sentence.toCharArray();
		int count =0;
		String word ="";
		for(int i=0;i<ch.length;i++) {
			//word += ch[i];
			if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ') {
//				count++;
//				words[count-1] = word;
//				word ="";
				word = word+ch[i];
			}
			else {
				count = count+1;
				words[count-1]= word;
			}
		}
		
		return words;
		
	}

	public static int countWords(String sentence) {
		
		char[] ch = sentence.toCharArray();
		int count =0;
		for(int i=0;i<ch.length;i++) {
			if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ') {
				count++;
			}
		}
		return count;
	}
	
	public static String[] extractWordUseRdmdFunc(String line) {
		String[] words = line.split(" ");
		return words;
		
	}
	
	

}
