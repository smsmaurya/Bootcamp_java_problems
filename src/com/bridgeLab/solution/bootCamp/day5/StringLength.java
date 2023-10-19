package com.bridgeLab.solution.bootCamp.day5;

public class StringLength {
	public static void main(String[] args) {
		String  str = "Sumesh";
		length(str);
		System.out.println("The length of the given string is :"+length(str));
	}

	private static int length(String str) {
		int length=0;
		for(char ch:str.toCharArray()) {
			length++;
		}
		return length;
	}

}
