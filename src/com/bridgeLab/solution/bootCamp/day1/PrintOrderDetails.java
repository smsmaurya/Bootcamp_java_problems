package com.bridgeLab.solution.bootCamp.day1;

import java.util.Scanner;

public class PrintOrderDetails {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the order ID : ");
		int orderID = sc.nextInt();
		
		System.out.println("Enter the Item name : ");
		String itemName = sc.next();
		
		System.out.print("Enter the item's quantity : ");
		int quantity = sc.nextInt();
		
		System.out.print("Enter the total cost of item : ");
		int totalCost = sc.nextInt();
		
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Order "+orderID+" : "+ quantity+" of "+itemName+" for a total of Rs"+totalCost +".");
		
	}

}
