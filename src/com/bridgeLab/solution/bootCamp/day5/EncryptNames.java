package com.bridgeLab.solution.bootCamp.day5;

import java.util.Scanner;

public class EncryptNames {

	public static void main(String[] args) {
		System.out.println(" Enter the 5 names");
		Scanner sc = new Scanner(System.in);

		String[] names = new String[1];
		for(int i=0;i<1;i++) {
			names[i] = sc.nextLine();
		}
		
		String [] encryptNames = encryptNames(names);
		for(String name : encryptNames)
			System.out.println(name);
	}
	
	public static String[] encryptNames(String[] names) {
		String[] encryptNames = new String[names.length];
		int in =0;
		for(String name : names) {
			char [] ch =name.toCharArray();
			String newString = "";
			for(int i=0;i<name.length();i++) {
				if((ch[i]>='A'&& ch[i]<'Z')) {
					int j = (int) (ch[i]+1);
					newString = ch[j]+newString;
				}
				else if(ch[i]=='Z') {
					ch[i]='A';
					newString = ch[i]+newString;
				}
				else if((ch[i]>='a'&& ch[i]<'z')) {
					int j = (int) (ch[i]+1);
					newString = ch[j]+newString;
				}
				else if(ch[i]=='z') {
					ch[i]='a';
					newString = ch[i]+newString;
				}else {
					
				}
			}
			encryptNames[in++]=newString;
		}
		
		return names;
		
	}
}
