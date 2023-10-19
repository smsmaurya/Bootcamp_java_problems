package com.bridgeLab.solution.bootCamp.day5;

public class ConversionNCompare {
	public static void main(String[] args) {
		
		String binaryNumber = "111001";
		
		int  decimalNumber = cnvrtBin2Dec(binaryNumber);
		System.out.println("\nThe converted binary number "+binaryNumber +" into decimal is : "+decimalNumber);
		
		String cnvrtDec2Bin = cnvrtDec2Bin(decimalNumber);
		System.out.println("\n\nThe converted decimal number "+decimalNumber +" into binary number string is : "+cnvrtDec2Bin);
		
		boolean compareBinaryDigits = compareBinaryDigits(binaryNumber, cnvrtDec2Bin);
		
		if(compareBinaryDigits == true)
			System.out.println("\n\nlogics developed are fine");
		else
			System.out.println("\n\nlogics developed are not fine");
	}
	
	public static String cnvrtDec2Bin(int decimalNumber) {
		
		String bin ="";
		int n = decimalNumber;
		while(n>0) {
			int b = n%2;
			n=n/2;
			bin =b+bin;
		}
		return bin; 
		
	}
	
	
	public static int cnvrtBin2Dec(String stringBinaryNum) {
		
		int binaryNumber = Integer.parseInt(stringBinaryNum);
		int n=binaryNumber,dec=0,e=0;

		while(n>0) {
			int b = n%10;
			n=n/10;
			dec=(int) (b*Math.pow(2, e))+dec;
			e++;
		}
		
		return dec;
		
	}
	
	public static boolean compareBinaryDigits(String binaryNumber, String cnvrtDec2Bin) {
		if(binaryNumber.equals(cnvrtDec2Bin))
			return true;
		
		return false;
		
	}
}
