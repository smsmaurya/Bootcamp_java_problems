package com.bridgeLab.solution.bootCamp.day2;

import java.util.Scanner;

public class GuessingTheNumber {
	public static void main(String[] args) {
		
		int generateRandomNum = (int) (Math.floor(Math.random()*100));

		System.out.println(" System generate a random number between 1 to 100");
		System.out.println("Now your turn, try to guess the number --- ");
		Scanner scan = new Scanner(System.in);
		boolean guessed = false; 

		while(!guessed) {
			System.out.print("Enter your guess number : ");
			int userGuessNumber = scan.nextInt();
			
			if(userGuessNumber == generateRandomNum) {
				guessed = true;
				System.out.println("You have guess same number.");
			}
			else if(userGuessNumber < generateRandomNum) {
				System.out.println("Two low");
			}
			else {
				System.out.println("too high");
			}
		}
		
	}

}
