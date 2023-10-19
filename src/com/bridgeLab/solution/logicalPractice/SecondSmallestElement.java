package com.bridgeLab.solution.logicalPractice;
import java.util.Arrays;

public class SecondSmallestElement {
	public static void main(String []args) {
		int[] arr = {12, 4, 7, 9, 2, 15, 3};
		int secondSmallestElement ;
		if(arr.length > 2) {
			Arrays.sort(arr);
			secondSmallestElement = arr[1];
			System.out.println("Second Smallest Element is: "+secondSmallestElement);
		}
		else {
			System.out.println("Array size is not enough");
		}
		
	}

}
